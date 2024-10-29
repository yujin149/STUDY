package Day11;

class Student1 { //디폴트
    int studentID; //디폴트
    private String studentName; //private

    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    //public이여도, class안에 있으면 밖으로 나갈 수가 없다.

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}

public class PrivateTast {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        //student1.studentName = "이상원";  studentName private
        //get-set 메소드를 통해서 사용가능
        student1.setStudentName("이상원");
        System.out.println(student1.getStudentName());
    }


}
