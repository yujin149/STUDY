package Day18;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EXServerTCP {
    public static void main(String[] args) throws IOException {
        int port = 777; //포트번호
        int times = 10; //client 10명까지는 대응 하겠다.
        ServerSocket ss = new ServerSocket(port); //서버소켓 생성
        int i = 1; //times와 비교해서 10명까지 카운트 해주는 변수
        while (i <= times) { //i가 times보다 작거나 같으면 반복
            Socket s = ss.accept(); //accept 메소드로 Client 소켓과 연결될 때까지 기다린다.
            ////////////////////////////////////연결되면 이제 시작됨////////////////////////////////////
            //소켓으로 Output 출력 스트림을 보내기 위해서 객체를 소켓으로 받는다.
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            //반복하면서 j 값을 Client에게 보낸다. 1~10까지 전송
            for (int j = 1; j <= 10; j++) {
                dos.write(j);
            }
            //전송이 끝나면  Client와 소켓을 끝는다.
            s.close();
            //i값은 1증가한다.
            ++i;

        }
        ss.close();
    }
}
