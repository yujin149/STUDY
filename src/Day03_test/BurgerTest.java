package Day03_test;

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
public class BurgerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.갈릭버거 2.페퍼로니 3.페퍼로니치킨 4.콜로수워치킨 5.종료");
            System.out.print("메인 메뉴(숫자 입력) : ");
            int mMenu = sc.nextInt();
            if (mMenu == 1) {
                System.out.println("1.갈릭버거를 선택하셨습니다.");
                System.out.println("1.감자튀김 2.콜라 3.사이다");
                System.out.print("사이드 메뉴(숫자 입력) : ");
                int sMenu = sc.nextInt();

                if (sMenu == 1) {
                    System.out.println("1.감자튀김을 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 감자튀김 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 감자튀김 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 감자튀김 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 2) {
                    System.out.println("2.콜라 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 콜라 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 콜라 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 콜라 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 3) {
                    System.out.println("3.사이다 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 사이다 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 사이다 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 갈릭버거 사이드 메뉴 : 사이다 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }

            } else if (mMenu == 2) {
                System.out.println("2.페퍼로니를 선택하셨습니다.");
                System.out.println("1.감자튀김 2.콜라 3.사이다");
                System.out.print("사이드 메뉴(숫자 입력) : ");
                int sMenu = sc.nextInt();

                if (sMenu == 1) {
                    System.out.println("1.감자튀김을 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 감자튀김 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 감자튀김 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 감자튀김 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 2) {
                    System.out.println("2.콜라 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 콜라 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 콜라 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 콜라 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 3) {
                    System.out.println("3.사이다 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 사이다 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 사이다 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 페퍼로니 사이드 메뉴 : 사이다 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }

            } else if (mMenu == 3) {
                System.out.println("3.페퍼로니치킨을 선택하셨습니다.");
                System.out.println("1.감자튀김 2.콜라 3.사이다");
                System.out.print("사이드 메뉴(숫자 입력) : ");
                int sMenu = sc.nextInt();

                if (sMenu == 1) {
                    System.out.println("1.감자튀김을 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 감자튀김 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 감자튀김 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 감자튀김 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 2) {
                    System.out.println("2.콜라 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 콜라 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 콜라 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 콜라 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 3) {
                    System.out.println("3.사이다 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 사이다 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 사이다 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 페퍼로니치킨 사이드 메뉴 : 사이다 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }

            } else if (mMenu == 4) {
                System.out.println("4.콜로수워치킨 선택하셨습니다.");
                System.out.println("1.감자튀김 2.콜라 3.사이다");
                System.out.print("사이드 메뉴(숫자 입력) : ");
                int sMenu = sc.nextInt();

                if (sMenu == 1) {
                    System.out.println("1.감자튀김을 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 감자튀김 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 감자튀김 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 감자튀김 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 2) {
                    System.out.println("2.콜라 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 콜라 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 콜라 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 콜라 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else if (sMenu == 3) {
                    System.out.println("3.사이다 선택하셨습니다.");
                    System.out.println("1.카드 2.상품권 3.현금");
                    System.out.print("결제 방법 입력 : ");
                    String pay = sc.next();
                    if (pay.equals("카드")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 사이다 결제방법 카드");
                    } else if (pay.equals("상품권")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 사이다 결제방법 상품권");
                    } else if (pay.equals("현금")) {
                        System.out.println("주메뉴 : 콜로수워치킨 사이드 메뉴 : 사이다 결제방법 현금");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                } else {
                    System.out.println("잘못된 입력입니다.");
                }

            } else if (mMenu == 5) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
