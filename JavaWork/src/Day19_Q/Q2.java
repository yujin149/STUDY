package Day19_Q;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//Maze JFrame 화면구성 제일 큰 단위
//ActionListener(이벤트 발생시 처리하는 함수를 이 클래스에서 정의)
class Maze extends JFrame implements ActionListener {

    Random r = new Random();
    int x1 = r.nextInt(5) * 80; //랜덤 0~4*80  //5X5라서 5 / 상자의 가로세로길이가 80 //빨간색
    int y1 = r.nextInt(5) * 80; //랜덤 0~4*80 //5X5라서 5 / 상자의 가로세로길이가 80 //빨간색
    int x2 = 320; //정수 변수 선언 후 320으로 초기화 //초록색 시작위치
    int y2 = 0; //정수 변수 선언 후 0으로 초기화 //초록색 시작위치
    JPanel p1; // JPanel 변수 선언
    JTextField jf; // JTextField 변수 선언

    Maze() //Maze 클래스 생성자
    {
        Container c = getContentPane();
        //Container 객체를 생성 getContentPane() <JFrame에 있음> 메소드를 이용
        c.setLayout(new BorderLayout()); //중앙에 놓으려고
        //Container 이용해서 Layout 설정
        //BorderLayout으로 Layout 설정
        p1 = new Mframe(); //업캐스팅 //JFrame 안에 Mfream
        //Mframe 객체를 생성
        //JPanel 변수 p1에 대입
        //객체 형변환
        p1.setLayout(new FlowLayout()); //Mframe은 FlowLayout
        //JPanel의 Layout을 FlowLayout으로 설정
        JPanel p2 = new JPanel();
        //JPanel의 객체를 생성해서 변수p2에 대입
        p2.setLayout(new BorderLayout());
        JButton b1 = new JButton("up");
        JButton b2 = new JButton("down");
        JButton b3 = new JButton("left");
        JButton b4 = new JButton("right");
        //버튼 4개 객체를 생성합니다
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        //체크박스, 버튼 (액션이 있음  ActionListener에 추가)
        //객체의 이벤트가 발생 시 누가 받을것인가?
        //함수인자의 객체가 이벤트를 처리해줌, this는 나 자신, 외부의 객체가 처리할거면 외부에 객체를 넣어준다음 만듬.b1.addActionListener(newA();)
        p2.add(b1, BorderLayout.NORTH);
        p2.add(b2, BorderLayout.SOUTH);
        p2.add(b3, BorderLayout.WEST);
        p2.add(b4, BorderLayout.EAST);
        //p2인 Jpanel에 버튼 4개 추가
        //BorderLayout 형식으로 동서남북 추가
        jf = new JTextField("탈출해주세요");
        p2.add(jf, BorderLayout.CENTER);

        c.add(p1);
        //p1 Jpanel을 JFrame에 추가
        c.add(p2, BorderLayout.SOUTH);
        //p2 JPanel을 JFrame에 추가
        //p2는 South를 남쪽에 배치
        setSize(415, 550);
        //JFrame 크기를 설정
        setVisible(true);
        //JFrame을 보여준다
        setTitle("escape the maze");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //기본 닫는 명령은 EXIT_ON_CLOSE다

    }

    //이벤트 리스너 함수
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("up")) {
            x2 -= 80; //사각형이 80X80이라서
            //x2에서 80을 뺀 값을 다시 x2에 대입

            if (x2 < 0)
                x2 = 0;
            else if (x2 > 320)
                x2 = 320;

        } else if (e.getActionCommand().equals("down")) {
            x2 += 80;
            if (x2 < 0)
                x2 = 0;
            else if (x2 > 320)
                x2 = 320;
        } else if (e.getActionCommand().equals("left")) {
            y2 -= 80;
            if (y2 < 0)
                y2 = 0;
            else if (y2 > 320)
                y2 = 320;

        } else if (e.getActionCommand().equals("right")) {
            y2 += 80;
            if (y2 < 0)
                y2 = 0;
            else if (y2 > 320)
                y2 = 320;

        }
        if (x1 == x2 && y1 == y2)
        //x1(랜덤인 통로 x좌표) y1(랜덤인 통로 y좌표)
        //버튼을 이동해서 이동한 위치인 x2,y2랑 같아지면 실행
        {
            jf.setText("탈출 성공!");
            //JTextField에 "탈출 성공" 출력

        }
        System.out.println(x1 + ", " + y1 + " : " + x2 + ", " + y2);
        p1.repaint(); //repaint(); 그림 그린것을 다시 그린다는 뜻
        //위에 명령이 끝나면 p1인 JPanel을 다시 그린다
        //repaint > paintComponent(Graphics g) 간다

    }

    //Mframe 클래스 p1을 만들기 위한 클래스
    //상속은 JPanel 상속을 받음
    class Mframe extends JPanel {

        //상속받은 그림을 그리는 paintComponent(Graphic g)를 오버라이딩 한 함수
        public void paintComponent(Graphics g) {
            super.paintComponent(g); //기본적으로 넣음
            //부모의 paintComponent를 호출할 때 구성하고있는 Graphics라고 하는걸 먼저 인자로 대입해서 만들어줌
            //p1 > JPanel을 꾸며주는 logic
            for (int i = 0; i <= 320; i = i + 80) {
                for (int j = 0; j <= 320; j = j + 80) {
                    g.drawRect(i, j, 80, 80); //drawRect 비어있는 사각형 //drawCircle 원형
                    //g(Graphics)이용해서 drawRectangle (0,0,80,80) (0,0)에 위치한 80x80크기의 정사각형을 그림
                }
            }
            //5x5 정사각형을 그리기위해 반복문 사용
            g.setColor(Color.GREEN);
            g.fillRect(y2, x2, 80, 80); //fillRect 사각형을 꽉채운다는 뜻 
            g.setColor(Color.RED);
            g.fillRect(y1, x1, 80, 80);
            if (x1 == x2 && y1 == y2) {
                for (int i = 0; i <= 320; i = i + 80) {
                    for (int j = 0; j <= 320; j = j + 80) {
                        g.clearRect(i, j, 80, 80);
                    }
                }
                g.setFont(new Font("맑은 고딕", Font.BOLD, 20));
                g.drawString("탈출 성공!", 160, 200);
            }
            //fillRectangle 색이 채워진 네모를 그린다
        }
    }
}


public class Q2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new Maze();
        //Maze 객체를 생성한다
    }
}
