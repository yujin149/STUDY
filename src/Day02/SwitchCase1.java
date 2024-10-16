package Day02;

public class SwitchCase1 {
    public static void main(String[] args) {
        int ranking = 1;
        char medalColor;
        switch(ranking){
            case 1:
                medalColor = 'G';
                //break;
                //break;가 없으면, 결과는 medalColor는 S가 된다.
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default :
                medalColor = 'A';
                break;
        }
        System.out.println(ranking + "등 메달의 색깔은 " +medalColor+"입니다.");
    }
}
