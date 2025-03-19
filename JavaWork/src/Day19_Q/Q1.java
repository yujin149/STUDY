package Day19_Q;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Calculator extends JFrame implements ActionListener {

    JLabel label;
    String textOutput = "";
    ArrayList<String> op = new ArrayList<String>();

    public Calculator() {
        // TODO Auto-generated constructor stub
        setSize(400, 400);
        setLocation(800, 400);
        setTitle("계산기");
        setVisible(true);

        label = new JLabel("0", JLabel.RIGHT);
        JPanel mainView = new JPanel();
        label.setBackground(Color.WHITE);
        label.setFont(new Font("", Font.BOLD, 50));
        label.setOpaque(true);// ������ ������ true

        JPanel btnView = new JPanel();
        btnView.setLayout(new GridLayout(5, 4, 5, 5)); //숫자버튼은 그리드배치  / 전체는 보더배치

        //for문으로 넣어도 됨. "1"만 문자열 넣어서 변환하면 됨.
        JButton b1 = new JButton("1");
        b1.addActionListener(this);
        btnView.add(b1);

        JButton b2 = new JButton("2");
        b2.addActionListener(this);
        btnView.add(b2);


        JButton b3 = new JButton("3");
        b3.addActionListener(this);
        btnView.add(b3);

        JButton bminer = new JButton("-");
        bminer.addActionListener(this);
        btnView.add(bminer);

        //2��° ��
        JButton b4 = new JButton("4");
        b4.addActionListener(this);
        btnView.add(b4);

        JButton b5 = new JButton("5");
        b5.addActionListener(this);
        btnView.add(b5);

        JButton b6 = new JButton("6");
        b6.addActionListener(this);
        btnView.add(b6);

        JButton bplus = new JButton("+");
        bplus.addActionListener(this);
        btnView.add(bplus);

        //3��° ��
        JButton b7 = new JButton("7");
        b7.addActionListener(this);
        btnView.add(b7);

        JButton b8 = new JButton("8");
        b8.addActionListener(this);
        btnView.add(b8);

        JButton b9 = new JButton("9");
        b9.addActionListener(this);
        btnView.add(b9);

        JButton bgob = new JButton("*");
        bgob.addActionListener(this);
        btnView.add(bgob);

        //4��° ��
        JButton b0 = new JButton("0");
        b0.addActionListener(this);
        btnView.add(b0);

        JButton bnone = new JButton("");
        btnView.add(bnone);

        JButton beq = new JButton("=");
        beq.addActionListener(this);
        btnView.add(beq);


        JButton bna = new JButton("/");
        bna.addActionListener(this);
        btnView.add(bna);

        mainView.setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(btnView, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();
        if (input.equals("=")) {
            //정규화 표현식 -> 0-9만 추출
            String regExp = "[^0-9]";
            String[] number = textOutput.split(regExp);
            int result = 0;
            for (int i = 0; i < op.size(); i++) {
                if (i == 0) {
                    if (op.get(i).equals("+")) {
                        result = Integer.parseInt(number[i]) + Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("-")) {
                        result = Integer.parseInt(number[i]) - Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("*")) {
                        result = Integer.parseInt(number[i]) * Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("/")) {
                        result = Integer.parseInt(number[i]) / Integer.parseInt(number[i + 1]);
                    }
                } else {
                    if (op.get(i).equals("+")) {
                        result += Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("-")) {
                        result -= Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("*")) {
                        result *= Integer.parseInt(number[i + 1]);
                    }
                    if (op.get(i).equals("/")) {
                        result /= Integer.parseInt(number[i + 1]);
                    }
                }
            }

            textOutput = result + "";
            label.setText(textOutput);
            op.clear();
        } else {
            if (input.equals("+")) {
                op.add("+");
            }
            if (input.equals("-")) {
                op.add("-");
            }
            if (input.equals("*")) {
                op.add("*");
            }
            if (input.equals("/")) {
                op.add("/");
            }

            textOutput += input;
            label.setText(textOutput);
        }
    }
}


public class Q1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Calculator();
    }
}
