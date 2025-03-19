package Day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CALC extends JFrame implements ActionListener {
    JLabel jl;  // 계산 결과를 표시할 JLabel
    String operator = "";  // 연산자 저장
    StringBuilder firstNumber = new StringBuilder();  // 첫 번째 숫자 저장
    StringBuilder secondNumber = new StringBuilder(); // 두 번째 숫자 저장
    boolean isSecondNumber = false;  // 두 번째 숫자 입력 여부를 확인하는 변수

    CALC() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());  // 컨테이너 레이아웃 설정 (위쪽, 아래쪽, 가운데 배치)

        // 결과를 표시할 JLabel 설정
        jl = new JLabel("0", SwingConstants.RIGHT);  // 초기 결과를 "0"으로 설정
        jl.setPreferredSize(new Dimension(420, 180));  // JLabel의 크기 설정
        jl.setFont(new Font("맑은 고딕", Font.BOLD, 50));  // 글꼴 설정
        jl.setOpaque(true);  // 배경색을 적용하기 위해 Opaque 설정
        jl.setBackground(Color.WHITE);  // 배경 색을 흰색으로 설정
        ct.add(jl, BorderLayout.NORTH);  // JLabel을 상단에 배치

        // 4x4 버튼을 배치할 패널 생성
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));  // 4x4 그리드 레이아웃, 버튼 간 간격 5px
        buttonPanel.setBackground(Color.decode("#f5f5f5"));  // 버튼 패널 배경색 설정

        // 버튼 텍스트 배열 (계산기 버튼들)
        String[] buttons = {"1", "2", "3", "-", "4", "5", "6", "+", "7", "8", "9", "*", "0", "C", "=", "/"};

        // 버튼 생성 및 설정
        for (String text : buttons) {
            JButton button = new JButton(text);  // 버튼 텍스트에 해당하는 버튼 생성
            button.setFont(new Font("맑은 고딕", Font.BOLD, 13));  // 버튼의 글꼴 설정
            button.setBorder(BorderFactory.createLineBorder(Color.decode("#d7d7d7")));  // 버튼 테두리 설정
            button.setFocusPainted(false);  // 버튼 클릭 시 포커스 효과 제거
            button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  // 버튼에 마우스 올리면 손 모양 커서로 변경
            button.setBackground(Color.decode("#eeeeee"));  // 버튼 배경색 설정

            button.addActionListener(this);  // 버튼 클릭 시 액션 리스너 추가
            buttonPanel.add(button);  // 버튼을 패널에 추가
        }

        // 버튼 패널을 메인 컨테이너에 추가
        ct.add(buttonPanel, BorderLayout.CENTER);

        // 윈도우 설정
        setTitle("계산기");  // 제목 설정
        setSize(420, 420);  // 윈도우 크기 설정
        setVisible(true);  // 윈도우를 보이도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 윈도우 종료 시 프로그램 종료
    }

    // 버튼 클릭 시 실행되는 메소드
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();  // 클릭된 버튼의 텍스트 가져오기

        // 숫자 입력 처리
        if ("0123456789".contains(input)) {  // 클릭한 버튼이 숫자일 경우
            if (isSecondNumber) {  // 두 번째 숫자를 입력 중이면
                secondNumber.append(input);  // 두 번째 숫자에 입력 추가
                jl.setText(secondNumber.toString());  // 결과 화면에 두 번째 숫자 표시
            } else {  // 첫 번째 숫자를 입력 중이면
                firstNumber.append(input);  // 첫 번째 숫자에 입력 추가
                jl.setText(firstNumber.toString());  // 결과 화면에 첫 번째 숫자 표시
            }
        }
        // 연산자 입력 처리
        else if ("+-*/".contains(input)) {  // 클릭한 버튼이 연산자일 경우
            if (firstNumber.length() > 0) {  // 첫 번째 숫자가 입력된 경우에만 연산자 입력 가능
                operator = input;  // 연산자 저장
                isSecondNumber = true;  // 두 번째 숫자를 입력 받기 위해 플래그 설정
            }
        }
        // 계산 처리
        else if ("=".equals(input)) {  // "=" 버튼 클릭 시 계산
            if (firstNumber.length() > 0 && secondNumber.length() > 0) {  // 첫 번째와 두 번째 숫자가 모두 입력된 경우
//                double num1 = Double.parseDouble(firstNumber.toString());  // 첫 번째 숫자 파싱
//                double num2 = Double.parseDouble(secondNumber.toString());  // 두 번째 숫자 파싱
//                double result = 0;
                int num1 = Integer.parseInt(firstNumber.toString());  // 첫 번째 숫자 파싱 (int로 변환)
                int num2 = Integer.parseInt(secondNumber.toString());  // 두 번째 숫자 파싱 (int로 변환)
                int result = 0;

                // 연산자에 따른 계산
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {  // 나누기 연산에서 0으로 나누면 오류 처리
                            result = num1 / num2;
                        } else {
                            jl.setText("Error");  // 0으로 나눌 경우 "Error" 표시
                            return;
                        }
                        break;
                }

                jl.setText(String.valueOf(result));  // 결과 화면에 결과 표시
                firstNumber.setLength(0);  // 첫 번째 숫자 초기화
                secondNumber.setLength(0);  // 두 번째 숫자 초기화
                operator = "";  // 연산자 초기화
                isSecondNumber = false;  // 두 번째 숫자 입력 플래그 초기화
                firstNumber.append(result);  // 결과를 첫 번째 숫자에 저장
            }
        }
        // 초기화 처리
        else if ("C".equals(input)) {  // "C" 버튼 클릭 시 초기화
            firstNumber.setLength(0);  // 첫 번째 숫자 초기화
            secondNumber.setLength(0);  // 두 번째 숫자 초기화
            operator = "";  // 연산자 초기화
            isSecondNumber = false;  // 두 번째 숫자 입력 플래그 초기화
            jl.setText("0");  // 화면에 0 표시
        }
    }
}

public class Q1_test {
    public static void main(String[] args) {
        new CALC();  // CALC 클래스의 인스턴스 생성 및 실행
    }
}
