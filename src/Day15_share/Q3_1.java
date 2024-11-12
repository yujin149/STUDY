package Day15_share;

class Unit1 {
    int price;
    int hp;
    int atk;
    int def;
    String target;
    double speed;
    String type;

    Unit1(int price, int hp, int atk, int def, String target, double speed, String type) {
        this.price = price;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.target = target;
        this.speed = speed;
        this.type = type;
    }
}

class Juggling extends Unit1 {
    Juggling() {
        super(50, 35, 5, 0, "지상", 2.612, "지상,소형,생체");
    }

    void print() {
        System.out.println("저글링의 생산 비용은  미네랄 :" + price + ",체력 :" + hp + ", 공격력 :" + atk + ",방어력 :" + def +
                " ,공격대상 :" + target + ", 이동속도 :" + speed + ", 유닛 특성 :" + type + "입니다.");
    }
}

class Hydra extends Unit1 {
    Hydra() {
        super(100, 80, 10, 0, "지상,공중", 1.741, "지상,중형,생체");
    }

    void print() {
        System.out.println("히드라의 생산 비용은  미네랄 :" + price + ",체력 :" + hp + ", 공격력 :" + atk + ",방어력 :" + def +
                " ,공격대상 :" + target + ", 이동속도 :" + speed + ", 유닛 특성 :" + type + "입니다.");
    }
}

class Marine extends Unit1 {
    Marine() {
        super(50, 50, 6, 0, "지상,공중", 1.875, "지상,소형,생체");
    }

    void print() {
        System.out.println("마린의 생산 비용은  미네랄 :" + price + ",체력 :" + hp + ", 공격력 :" + atk + ",방어력 :" + def +
                " ,공격대상 :" + target + ", 이동속도 :" + speed + ", 유닛 특성 :" + type + "입니다.");
    }
}

class Teran {  //테란 클래스
    Marine[] m = new Marine[3]; //마린 3마리 배열로 생성
    int turn = 0;   //턴 수
    int attackIndex = 0;

    Teran() {
        for (int i = 0; i < m.length; i++) {
            m[i] = new Marine();  //마린 생성
            m[i].print();  //마린 정보 출력
        }
    }

    Marine AttackM() { // 공격할 마린
        for (int i = 0; i < m.length; i++) { // 모든 마린을 순회
            int index = (attackIndex + i) % 3; // 현재 턴에 따라 인덱스 결정
            if (m[index] != null) { // 살아있는 마린을 찾으면
                System.out.println(index + "번째 마린이 공격합니다."); // 공격하는 마린 출력
                attackIndex = (index + 1) % 3;
                return m[index]; // 살아있는 마린 반환
            }
        }
        return null; // 살아있는 마린이 없으면 null 반환
    }

    Marine attackedM() { //공격 받은 마린 확인하는 메서드
        for (int i = 0; i < m.length; i++) {
            int index = (attackIndex + i) % 3;
            if (m[index] != null) {  //살아있는 마린 확인
                System.out.println(index + "번째 마린이 공격 받았습니다."); //공격 받은 마린 출력시키고
                System.out.println("남은 hp : " + m[index].hp);
                return m[index]; //공격 받은 마린 반환시킴
            }
        }
        return null;
    }

    void DeathM() { //마린 죽었는지 확인  하는 메서드
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && m[i].hp <= 0) {   //마린이 살아있고 마린의 체력이 0이하일때
                System.out.println((i + 1) + "번째 마린이 죽었습니다."); //죽은 마린 출력
                m[i] = null; // 마린 제거시킴
            } else if (m[i] != null) {
                System.out.println((i + 1) + "번째 마린의 남은 hp : " + m[i].hp);
            }
        }
    }

    boolean CheckM() { //게임 확인
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null) {  //살아있는 마린이 있을 경우
                return true;  //true 로 반환시킴
            }
        }
        System.out.println("모든 마린이 죽었습니다."); // 위에서 모든 마린이 죽었을경우 출력시킴
        return false;
    }
}

class Zerg {
    Juggling j;  //저글링 객체
    Hydra h;  // 히드라 객체

    int turn = 0;

    Zerg() {
        j = new Juggling();   // 저글링 객체 생성 함
        h = new Hydra();   // 히드라 객체 생성 함
        j.print();  ///  저글링 정보 출력
        h.print(); /// 히드라 정보 출력
    }

    void AttackedZ(Marine m) { //   저그가 공격 당했을 떄의 메서드
        if (j != null) {   // 저글링이 살아 있을때
            System.out.println("저글링이 마린에게 공격을 받았습니다.");
            j.hp -= m.atk; // 저글링이 공격받을때 마린의 공격력만큼 저글링의 hp 감소
            if (j.hp <= 0) {
                j = null;
                System.out.println("저글링이 죽었습니다.");
            }
        } else if (h != null) {  // 히드라가 죽었을때
            System.out.println("히드라가 마린에게 공격을 받았습니다.");
            h.hp -= m.atk;  //히드라가 공격받을때 마린의 공격력만큼 히드라의 hp 감소
            if (h.hp <= 0) {
                h = null;
                System.out.println("히드라가 죽었습니다.");
            }
        }
    }

    boolean CheckZ() { // 게임 종료 확인
        if (j != null) {
            return true;
        }
        if (h != null) {
            return true;
        } else {
            return false;
        }
    }
}


public class Q3_1 {
    public static void main(String[] args) {
        Teran t = new Teran();
        Zerg z = new Zerg();
        boolean check;
        int cnt = 1;

        while (true) {
            System.out.println((cnt++) + "턴 저그 공격");

            // 저글링이 공격하는 경우
            if (z.j != null) {
                System.out.println("저글링이 공격합니다.");
                Marine m = t.attackedM();
                if (m != null) {
                    m.hp -= z.j.atk;
                    System.out.println("공격받은 마린의 남은 체력: " + m.hp);
                    t.DeathM();
                    check = t.CheckM();
                    if (!check) {
                        System.out.println("저그가 이겼습니다.");
                        break;
                    }
                }
            }
            // 히드라가 공격하는 경우
            else if (z.h != null) {
                System.out.println("히드라가 공격합니다.");
                Marine m = t.attackedM();
                if (m != null) {
                    m.hp -= z.h.atk;
                    System.out.println("공격받은 마린의 남은 체력: " + m.hp);
                    t.DeathM();
                    check = t.CheckM();
                    if (!check) {
                        System.out.println("저그가 이겼습니다.");
                        break;
                    }
                }
            }

            // 테란의 공격 턴
            System.out.println((cnt++) + "턴 테란 공격");
            Marine m = t.AttackM();
            if (m != null) {
                z.AttackedZ(m);
            }

            // 각 유닛들의 남은 체력 상태 출력
            if (z.j != null) {
                System.out.println("저글링의 남은 체력: " + z.j.hp);
            }
            if (z.h != null) {
                System.out.println("히드라의 남은 체력: " + z.h.hp);
            }
            for (int i = 0; i < t.m.length; i++) {
                if (t.m[i] != null) {
                    System.out.println("마린 " + (i + 1) + "의 남은 체력: " + t.m[i].hp);
                }
            }

            // 게임 종료 조건 체크
            check = z.CheckZ();
            if (!check) {
                System.out.println("테란팀이 이겼습니다.");
                break;
            }
        }
    }
}
