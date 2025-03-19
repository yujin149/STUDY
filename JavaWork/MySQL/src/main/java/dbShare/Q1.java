package dbShare;

import java.sql.*;
import java.util.Scanner;

public class Q1 {
    // MySQL 연결 정보
    private static final String URL = "jdbc:mysql://localhost:3306/databaseprogramming";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection conn = null;

        try {

            // 1. MySQL 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("데이터베이스에 연결되었습니다.");

            while (true) {
                System.out.print("\n메뉴 : ");
                System.out.print(" 1.추가 ");
                System.out.print(" 2.삭제 ");
                System.out.print(" 3.전체 출력 ");
                System.out.print(" 4.이름 검색 ");
                System.out.println(" 5.종료 ");
                System.out.print("선택: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 제거

                switch (choice) {
                    case 1:
                        addRecord(conn, scanner);
                        break;
                    case 2:
                        deleteRecord(conn, scanner);
                        break;
                    case 3:
                        displayAllRecords(conn);
                        break;
                    case 4:
                        searchByName(conn, scanner);
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("잘못된 선택입니다.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 2-1. 데이터 추가
    private static void addRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("이름: ");
        String Name = scanner.nextLine();
        System.out.print("주소: ");
        String Address = scanner.nextLine();
        System.out.print("전화번호: ");
        String Tel = scanner.nextLine();

        String query = "INSERT INTO 소비자 (Name, Address, Tel) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, Name);
            pstmt.setString(2, Address);
            pstmt.setString(3, Tel);
            pstmt.executeUpdate();
            System.out.println("데이터가 추가되었습니다.");
        }
    }

    // 2-2. 데이터 삭제 (이름으로 삭제)
    private static void deleteRecord(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("삭제할 이름: ");
        String Name = scanner.nextLine();

        String query = "DELETE FROM 소비자 WHERE Name = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, Name);
            int rowsAffected = pstmt.executeUpdate(); // 영향을 받은 행 수 반환
            if (rowsAffected > 0) {
                System.out.println("이름이 '" + Name + "'인 데이터가 삭제되었습니다.");
            } else {
                System.out.println("해당 이름을 가진 데이터를 찾을 수 없습니다.");
            }
        }
    }

    // 2-3. 전체 출력
    private static void displayAllRecords(Connection conn) throws SQLException {
        String query = "SELECT * FROM 소비자";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\n전체 데이터 : ");
            while (rs.next()) {
                String Name = rs.getString("Name");
                String Address = rs.getString("Address");
                String Tel = rs.getString("Tel");
                System.out.printf("이름: %s, 주소: %s, 전화번호: %s\n", Name, Address, Tel);
            }
        }
    }

    // 2-4. 이름 검색
    private static void searchByName(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("검색할 이름: ");
        String Name = scanner.nextLine();

        String query = "SELECT * FROM 소비자 WHERE Name LIKE ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "%" + Name + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("\n검색 결과:");
                while (rs.next()) {
                    String foundName = rs.getString("Name");
                    String Address = rs.getString("Address");
                    String Tel = rs.getString("Tel");
                    System.out.printf("이름: %s, 주소: %s, 전화번호: %s\n", foundName, Address, Tel);
                }
            }
        }
    }
}
