package Day19;

import javax.swing.*;
import java.awt.*;

class GridLayout1 extends JFrame {
    GridLayout1() {
        Container ct = getContentPane();
        GridLayout gl = new GridLayout(4, 5, 10, 10); //4행 5열 갭을 가로 세로 10
        ct.setLayout(gl);
//        for (int i = 1; i <= 20; i++) {
//            ct.add(new JButton("버튼" + i));
//        }

        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton("버튼" + i);
            button.setBackground(Color.white); // 버튼 배경 색상 변경
            button.setFont(new Font("맑은 고딕", Font.BOLD, 16)); // 폰트 스타일 및 크기 변경
            button.setBorderPainted(false); // 버튼 테두리 제거
            button.setFocusPainted(false); // 포커스 시 나타나는 선 제거
            ct.add(button);
        }

        setTitle("GridLayoutTest1");
        setSize(800, 800);
        setVisible(true);
    }
}

public class GridLayoutTest {
    public static void main(String[] args) {
        new GridLayout1();
    }
}
