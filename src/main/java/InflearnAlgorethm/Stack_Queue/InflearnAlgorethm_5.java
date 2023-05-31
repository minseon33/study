package InflearnAlgorethm.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

//5. 쇠막대기
public class InflearnAlgorethm_5 {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='('){
                stack.push('(');
            }else {
                stack.pop();
                if(str.charAt(i-1)=='('){
                    answer+=stack.size();
                }else {
                    answer++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_5 T = new InflearnAlgorethm_5();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String n = kb.next();

        System.out.println(T.solution(n));

    }

}
