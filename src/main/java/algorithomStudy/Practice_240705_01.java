package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 피보나치 수 5
 * https://www.acmicpc.net/problem/10870
 */
public class Practice_240705_01 {

    //내 풀이
    //재귀연습

    public int factorial(int num){
        if(num==0) {
            return 0;
        } else if (num==1) {
            return 1;

        }else if(num==2){
            return 1;
        }else {
            return factorial(num-2)+factorial(num-1);
        }
    }
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
            int factorial = factorial(num);
            System.out.println(factorial);
    }


    /**
     * 결과 :
     * 메모리 : 14220KB
     * 시간 : 108ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {


    }

    /**
     * 결과 :
     * 메모리 : 25844KB
     * 시간 : 336ms
     */
    public static void main(String[] args) throws IOException {
        Practice_240705_01 practice = new Practice_240705_01();
        practice.solution();
        practice.solution2();

    }
}
