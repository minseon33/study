package InflearnAlgorethm.StackQueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//2. 괄호 문자 제거
public class InflearnAlgorethm_2 {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char a : str.toCharArray()) {
            stack.push(a);
            if (a == ')') {
                while (true) {
                    if (stack.peek() != '(') {
                        stack.pop();
                    } else {
                        stack.pop();
                        break;
                    }
                }
            }
        }

        int num = stack.size();

        for (int i = 0; i < num; i++) {
           answer+=stack.get(i);
        }



        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_2 T = new InflearnAlgorethm_2();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
//        String a = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        System.out.println(T.solution(n));

    }

}
