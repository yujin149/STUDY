package Day18;

import java.util.ArrayList;
import java.util.HashMap;


//충격이에요.

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //{"muzi","frodo","apeach","neo"} : id_list
        //{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"} : report
        //k : 2 (정지횟수)

        // 1. Map -> key : 신고당한사람 / 값 : 신고한사람
        HashMap<String, ArrayList<String>> map = new HashMap<>(); //<신고당한값, ArrayList<신고한 사람>>
        // 2. Map -> key : User      / 값 : 메일 횟수
        HashMap<String, Integer> mailSend_map = new HashMap<>();

        // 맵객체 생성
        // 향상된 for문
        //{"muzi","frodo","apeach","neo"} //name에 들어감.
        for (String name : id_list) {
            ArrayList<String> list = new ArrayList<>(); // String을 제네릭한 ArrayList 객체 생성
            map.put(name, list); //id_list별로 초기화
            mailSend_map.put(name, 0);//id_list별로 초기화
        }

        //map -> muzi (key), ArrayList<String> (객체 유) [0] : apeach
        //    -> frodo (key), ArrayList<String> (객체 유) [0] : muzi
        //    -> apeach (key), ArrayList<String> (객체 유)
        //    -> neo (key), ArrayList<String> (객체 유) [0] : frodo [1] : muzi

        //mailSend_map -> muzi (key), 0
        //             -> frodo (key), 0
        //             -> apeach (key), 0
        //             -> neo (key), 0


        // report -> map 데이터를 넣어줍니다.
        //{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}
        for (int i = 0; i < report.length; i++) { //report는 신고당한 내역
            String[] temp = report[i].split(" "); //[0] : muzi  [1] : frodo
            String a = temp[0]; // 신고자 muzi
            String b = temp[1]; // 신고당한사람 frodo
            ArrayList<String> arr = map.get(b); // key값이 frodo인 객체 추출 //ArrayList<String> (객체 유)

            //중복을 확인해주는게 있음
            //ArrayList 객체 안에 신고자 muzi있는지 확인
            if (arr.contains(a)) { //contains(a)는 있는지 없는지 확인
                continue; //있으면, continue로 올림.
            }

            arr.add(a); // 값 ArrayList에 신고자를 추가 muzi //ArrayList[0] -> muzi
            map.put(b, arr); // b신고당한사람 frodo 값을 arr변수를 대입 //arr에 muzi가 들어감

        }
        //map 키꾸러미 빼면 {muzi,neo,frodo,apeach}
        for (String name : map.keySet()) {
            ArrayList<String> arr = map.get(name); //muzi (key), ArrayList<String> (객체 유) [0] : apeach
            //frodo (key), ArrayList<String> (객체 유) [0] : muzi
            // apeach (key), ArrayList<String> (객체 유)
            // neo (key), ArrayList<String> (객체 유) [0] : frodo [1] : muzi
            if (arr.size() >= k) {
                //                2
                for (int i = 0; i < arr.size(); i++) {
                    //                                0 frodo
                    int count = mailSend_map.get(arr.get(i)) + 1;
                    mailSend_map.put(arr.get(i), count);
                }
            }
        }

        //mailSend_map -> muzi (key), 0
        //             -> frodo (key), 2
        //             -> apeach (key), 0
        //             -> neo (key), 2

        //answer 배열 객체 생성 id리스트 크기로
        //{"muzi","frodo","apeach","neo"}
        //   0      2       0        2
        int[] answer = new int[id_list.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mailSend_map.get(id_list[i]);
        }
        return answer;
    }
}


public class Q3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Solution s = new Solution();

        String[] id = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        int[] a = s.solution(id, report, 2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
