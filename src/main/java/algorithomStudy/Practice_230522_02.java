package algorithomStudy;

import java.util.HashMap;

// flag에 따라 다른 값 반환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181933
public class Practice_230522_02 {

    public int solution(int a, int b , boolean flag) {
        int answer = 0;
        if(flag){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice_230522_02 t = new Practice_230522_02();
        int a = -4;
        int b = 7;
        boolean flag = true;
        System.out.println(t.solution(a,b,flag));
    }
}
