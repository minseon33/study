package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 개수 세기
 * https://www.acmicpc.net/problem/10807
 */
public class Practice_240701_02 {


    //내 풀이
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i]==v){
                count++;
            }
        }

        System.out.println(count);

    }

    /**
     * 결과 :
     * 메모리 : 14232KB
     * 시간 : 104ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {


    }


    public static void main(String[] args) throws IOException {
        Practice_240701_02 practice = new Practice_240701_02();
        practice.solution();
        practice.solution2();
    }
}
