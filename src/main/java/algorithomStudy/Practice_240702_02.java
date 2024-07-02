package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 소수 구하기
 * https://www.acmicpc.net/problem/1929
 */
public class Practice_240702_02 {


    //내 풀이
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());
        int[] arr = new int[number+1];

        for (int i = 0; i < number+1; i++) {
            arr[i]=i;
        }

        arr[0] = 0;
        arr[1] = 0;

        for (int i = 2; i < number+1; i++) {
            for (int j = i+i; j <= number; j+=i) {
                arr[j]=0;
            }
        }

        for (int a:arr) {
            if(a>=n && a!=0){
                System.out.println(a);
            }
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
        Practice_240702_02 practice = new Practice_240702_02();
        practice.solution();
        practice.solution2();

    }
}
