package Day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI2 extends JFrame implements ActionListener {
    JLabel jl;

    GUI2() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout()); //화면 배치를 FlowLayout으로 설정
        JButton j1 = new JButton("1");//버튼 1
        JButton j2 = new JButton("2");//버튼2
        jl = new JLabel("안녕!");//라벨 안녕!
        ct.add(j1);//컨테이너에 버튼 1 추가
        ct.add(j2);//컨테이너에 버튼 2 추가
        ct.add(jl); // 컨테이너에 버튼 3추가
        j1.addActionListener(this); // 리스너 설정
        j2.addActionListener(this); // 리스너 설정
        setTitle("GUI Test2"); // 타이틀
        setSize(500, 500); // GUI 크기
        setVisible(true); // 보여주기 true
    }

    //이벤트 발생시 동작하는 리스너 오버라이딩
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand(); // 뭐가 눌렸는지 알수 있다.
        String result = "안녕!" + input;
        jl.setText(result);
        System.out.println(input);
    }
}

public class GUITest2 {
    public static void main(String[] args) {
        new GUI2();
    }
}
