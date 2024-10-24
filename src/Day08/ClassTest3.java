package Day08;

class B {
    String name;

    String getName() {
        return name;
    }
}

public class ClassTest3 {
    public static void main(String[] args) {
        B Ahn = new B();
        Ahn.name = "안연수";
        System.out.println(Ahn.name); //안연수
        System.out.println(Ahn.getName()); //안연수
    }
}
