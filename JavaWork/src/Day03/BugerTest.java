package Day03;

import java.util.Scanner;

/*
 * 메인 메뉴 -> 숫자
 * 1. 갈릭버거 2.페퍼로니 3.페퍼로니치킨 4. 콜로수워치킨 5.종료
 * 사이드 메뉴 ->숫자
 * 1.감자튀김 2. 콜라 3.사이다
 * 결제 -> 문자열 입력
 * 1.카드 2.상품권 3.현금
 * 주메뉴 : 갈릭버거 사이드 메뉴 : 감자튀김 결제방법 카드
 */
public class BugerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu; //주메뉴
        String sideMenu; //사이드 메뉴
        String pay; //결제 수단
        int sNum;

        boolean check = true;
        while (check) {
            System.out.print("메뉴를 입력하세요. >");
            int mNum = sc.nextInt();
            switch (mNum) {
                case 1: //갈릭버거
                    menu = "갈릭버거";
                    System.out.print("사이드 메뉴를 입력하세요. >");
                    sNum = sc.nextInt();
                    switch (sNum) {
                        case 1: //감자튀김
                            sideMenu = "감자튀김";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 2: //콜라
                            sideMenu = "콜라";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 3: //사이다
                            sideMenu = "사이다";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
                    break;
                case 2: //페퍼로니
                    menu = "페퍼로니";
                    System.out.print("사이드 메뉴를 입력하세요. >");
                    sNum = sc.nextInt();
                    switch (sNum) {
                        case 1: //감자튀김
                            sideMenu = "감자튀김";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 2: //콜라
                            sideMenu = "콜라";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 3: //사이다
                            sideMenu = "사이다";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
                    break;
                case 3: //페퍼로니치킨
                    menu = "페퍼로니치킨";
                    System.out.print("사이드 메뉴를 입력하세요. >");
                    sNum = sc.nextInt();
                    switch (sNum) {
                        case 1: //감자튀김
                            sideMenu = "감자튀김";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 2: //콜라
                            sideMenu = "콜라";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 3: //사이다
                            sideMenu = "사이다";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
                    break;
                case 4: //콜로수워치킨
                    menu = "콜로수워치킨";
                    System.out.print("사이드 메뉴를 입력하세요. >");
                    sNum = sc.nextInt();
                    switch (sNum) {
                        case 1: //감자튀김
                            sideMenu = "감자튀김";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 2: //콜라
                            sideMenu = "콜라";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        case 3: //사이다
                            sideMenu = "사이다";
                            System.out.print("결제방법을 선택해주세요. >");
                            pay = sc.next();
                            if (pay.equals("카드") || pay.equals("상품권") || pay.equals("현금")) {
                                System.out.println("주메뉴 : " + menu + "사이드메뉴 : " + sideMenu + "결제 방법 : " + pay);
                            } else {
                                System.out.println("결제수단이 잘 못됬습니다.");
                            }
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
                    break;
                case 5: //종료
                    System.out.println("프로그램을 종료합니다.");
                    check = false;
                    break;
                default: //잘못된 입력
                    System.out.println("잘못된 입력됩니다.");
                    break;

            }
        }
    }
}
