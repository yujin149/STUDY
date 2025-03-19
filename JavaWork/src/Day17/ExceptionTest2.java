package Day17;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) throws IOException { //I는 input O는 output //IOException 업출력이라는 뜻.
        FileReader fr;
        fr = new FileReader("c.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }
        fr.close();
    }
}
