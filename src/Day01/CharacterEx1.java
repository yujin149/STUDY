package Day01;

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); //A
        System.out.println((int)ch1); //65 강제 형 변환

        char ch2 = 66;
        System.out.println(ch2); //B 자료형이 char이기 때문에

        int ch3 = 67;
        System.out.println(ch3); //67;
        System.out.println((char) ch3); //C

        char kor = '각';
        System.out.println((int)kor); //44033 '각'의 코드표

        //char t1 = -65; char는 음수가 안된다.
        


    }
}
