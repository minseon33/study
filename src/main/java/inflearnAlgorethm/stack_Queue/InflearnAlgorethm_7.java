package inflearnAlgorethm.stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//7. 교육과정 설계
public class InflearnAlgorethm_7 {

    public String solution(String n, String k) {
        //내풀이
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();

        for (char a: n.toCharArray()) q.add(a);

        for (char a:k.toCharArray()) {
            if(q.contains(a)){
                if(q.peek()==a){
                    q.remove();
                }else {
                    continue;
                }
            }
        }

        if(!q.isEmpty()){
            answer="NO";
        }



        return answer;
    }

    public String solution2(String n, String k) {
        //강의풀이
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for (char a:n.toCharArray()) q.add(a);
        for (char a:k.toCharArray()) {
            if(q.contains(a)){
                if(a!=q.poll()) return "NO";
            }
        }
        if(!q.isEmpty()) return "NO";

        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_7 T = new InflearnAlgorethm_7();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String k = kb.next();

        System.out.println(T.solution(n,k));

    }

}
