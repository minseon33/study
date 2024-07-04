package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 팩토리얼2
 * https://www.acmicpc.net/problem/27433
 */
public class Practice_240704_01 {

    //내 풀이
    //재귀연습

    public Long factorial(int num,long result){
        if(num==0){
            return result;
        }else {
            result*=num;
            result = factorial(num - 1, result);
        }
        return result;
    }
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num == 0){
            System.out.println(1);
        }else {
            Long factorial = factorial(num, 1);
            System.out.println(factorial);
        }
    }


    /**
     * 결과 :
     * 메모리 : 26616KB
     * 시간 : 528ms
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
        Practice_240704_01 practice = new Practice_240704_01();
        practice.solution();
        practice.solution2();

    }
}
