package InflearnAlgorethm.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class InflearnAlgorethm_1 {

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x:str.toCharArray()) {
            if(x=='('){
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }



        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_1 T = new InflearnAlgorethm_1();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        System.out.println(T.solution(n));

    }

}
