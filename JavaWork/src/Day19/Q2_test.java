package Day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class Maze extends JFrame {
    int[][] list = new int[5][5]; // 미로배열
    JButton[][] buttons = new JButton[5][5]; // 버튼 배열

    int startY, startX; // 시작점 위치
    int goalY, goalX; // 목표점 위치

    Maze() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());  // BorderLayout 사용

        JPanel mazePanel = new JPanel();
        mazePanel.setLayout(new GridLayout(5, 5, 5, 5));  // 미로 버튼들 배치 (간격 5px)

        Random r = new Random();

        goalY = r.nextInt(5);
        goalX = r.nextInt(5);
        list[goalY][goalX] = 1; // 랜덤으로 1을 배치하여 목표지점으로 설정

        startY = r.nextInt(5);
        startX = r.nextInt(5);

        if (list[goalY][goalX] == list[startY][startX]) {
            startY = r.nextInt(5);
            startX = r.nextInt(5);
        }
        list[startY][startX] = 2; // 시작점 설정

        // 버튼 배치 및 미로 표시
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                JButton button = new JButton();
                button.setBackground(Color.decode("#eeeeee"));
                button.setBorder(BorderFactory.createLineBorder(Color.decode("#d7d7d7")));
                button.setFocusPainted(false);
                Dimension size = new Dimension(80, 80); // 고정 크기
                button.setPreferredSize(size); // 원하는 크기
                button.setMaximumSize(size);   // 최대 크기 제한
                button.setMinimumSize(size);   // 최소 크기 제한

                // 랜덤으로 배치된 1(목표지점)을 다른 색상으로 변경
                if (list[i][j] == 1) {
                    button.setBackground(Color.decode("#f36095"));  // 핑크색으로 목표지점 표시
                }

                if (list[i][j] == 2) {
                    button.setBackground(Color.decode("#719bdd"));  // 파란색으로 시작점 표시
                }

                // 버튼 배열에 저장
                buttons[i][j] = button;

                mazePanel.add(button); // 미로 버튼을 mazePanel에 추가
            }
        }

        // 이동 버튼 패널
        JPanel movePanel = new JPanel();
        movePanel.setLayout(new GridLayout(1, 4, 10, 10));  // 이동 버튼들을 가로로 배치
        movePanel.setPreferredSize(new Dimension(400, 50)); // 이동 버튼 영역 크기 설정

        JButton moveUpButton = new JButton("Up");
        JButton moveDownButton = new JButton("Down");
        JButton moveLeftButton = new JButton("Left");
        JButton moveRightButton = new JButton("Right");

        // 버튼 색상 변경
        moveUpButton.setBackground(Color.decode("#f5f5f5"));
        moveDownButton.setBackground(Color.decode("#f5f5f5"));
        moveLeftButton.setBackground(Color.decode("#f5f5f5"));
        moveRightButton.setBackground(Color.decode("#f5f5f5"));

        // 버튼 테두리 색상 변경
        moveUpButton.setBorder(BorderFactory.createLineBorder(Color.decode("#d7d7d7"), 1));
        moveDownButton.setBorder(BorderFactory.createLineBorder(Color.decode("#d7d7d7"), 1));
        moveLeftButton.setBorder(BorderFactory.createLineBorder(Color.decode("#d7d7d7"), 1));
        moveRightButton.setBorder(BorderFactory.createLineBorder(Color.decode("#d7d7d7"), 1));

        // 버튼 폰트 크기 변경
        Font buttonFont = new Font("맑은 고딕", Font.BOLD, 12);  // Arial, Bold, 크기 16
        moveUpButton.setFont(buttonFont);
        moveDownButton.setFont(buttonFont);
        moveLeftButton.setFont(buttonFont);
        moveRightButton.setFont(buttonFont);


        moveUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePlayer(-1, 0); // 상으로 이동
            }
        });

        moveDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePlayer(1, 0); // 하으로 이동
            }
        });

        moveLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePlayer(0, -1); // 좌로 이동
            }
        });

        moveRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movePlayer(0, 1); // 우로 이동
            }
        });

        movePanel.add(moveUpButton);
        movePanel.add(moveDownButton);
        movePanel.add(moveLeftButton);
        movePanel.add(moveRightButton);

        // 이동 버튼에 상하 여백을 주기 위해 EmptyBorder 추가
        movePanel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));  // 위아래에 각각 10px 여백 추가

        // 패널을 윈도우에 추가
        ct.add(mazePanel, BorderLayout.CENTER);  // 미로를 중앙에 배치
        ct.add(movePanel, BorderLayout.SOUTH);   // 이동 버튼을 하단에 배치

        setTitle("Escape the Maze");
        setSize(440, 500);  // 창 크기 (버튼 영역 추가로 높이 증가)
        setVisible(true);
    }

    // 플레이어 이동 처리
    private void movePlayer(int dy, int dx) {
        int newY = startY + dy;
        int newX = startX + dx;

        // 유효한 범위 내에서 이동할 수 있도록 처리
        if (newY >= 0 && newY < 5 && newX >= 0 && newX < 5) {
            // 이전 위치 리셋
            buttons[startY][startX].setBackground(Color.decode("#eeeeee"));
            // 새로운 위치 업데이트
            startY = newY;
            startX = newX;
            buttons[startY][startX].setBackground(Color.decode("#719bdd"));  // 파란색으로 표시

            // 게임 종료 조건 체크
            if (startY == goalY && startX == goalX) {
                JOptionPane.showMessageDialog(this, "You reached the goal!");
            }
        }
    }
}

public class Q2_test {
    public static void main(String[] args) {
        new Maze();
    }
}
