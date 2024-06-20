package inflearnAlgorethm.stack_Queue;

import java.util.Scanner;
import java.util.Stack;

//4. 후위식 연산
public class InflearnAlgorethm_4 {

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x:str.toCharArray()) {
            if(Character.isDigit(x)){
                stack.push(x-48);
            }else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+'){
                    stack.push(lt+rt);
                } else if (x=='-') {
                    stack.push(lt-rt);
                } else if (x=='*') {
                    stack.push(lt*rt);
                }  else if (x=='/') {
                    stack.push(lt/rt);
                }
            }
        }


        return answer=stack.get(0);
    }


    public static void main(String[] args) {
        InflearnAlgorethm_4 T = new InflearnAlgorethm_4();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String n = kb.next();

        System.out.println(T.solution(n));

    }

}
