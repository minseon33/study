package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/**
 * 수 정렬하기 2
 * https://www.acmicpc.net/problem/2751
 */
public class Practice_240701_03 {


    //내 풀이
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }


    /**
     * 결과 :
     * 메모리 : 179492KB
     * 시간 : 4892ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] a = new boolean[2000001];
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++)
            a[Integer.parseInt(br.readLine()) + 1000000] = true;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<=2000000; i++)
            if(a[i])
                sb.append((i - 1000000) + "\n");

        System.out.print(sb);

    }

    /**
     * 결과 :
     * 메모리 : 129608KB
     * 시간 : 800ms
     */
    public static void main(String[] args) throws IOException {
        Practice_240701_03 practice = new Practice_240701_03();
        practice.solution();
        practice.solution2();

    }
}
