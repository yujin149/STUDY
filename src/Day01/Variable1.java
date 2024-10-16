package Day01;

public class Variable1 {
    public static void main(String[] args) {
        int level; //선언
        level = 10; //값이 대입

        System.out.println(level);//출력
        int level2 = 20; //선언과 동시에 초기화
        System.out.println(level2);

        System.out.println(level + "+" +level2 + " = " +(level + level2));
        //level + "+"을 했을때, level 이 문자열이 된다.
        //"10"+"5" => 105로 출력.
        System.out.printf("%d + %d = %d",level,level2,level+level2);



    }
}
