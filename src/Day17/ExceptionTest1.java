package Day17;

import java.io.FileReader;

public class ExceptionTest1 {
    public static void main(String[] args) {
        FileReader fr;
        try {
            fr = new FileReader("c.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("예외 처리 루틴 : " + e + "파일이 존재하지 않는다.");
        } finally {
            System.out.println("하이");
        }
    }
}
