package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 초심으로 돌아가자, 단계별 문제 도장깨기.
 * 최소, 최대
 * 레벨 : 브론즈3
 * https://www.acmicpc.net/problem/10818
 */
public class Practice_240726_01 {


    public static void main(String[] args) throws IOException {
        Practice_240726_01 practice = new Practice_240726_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num:arr) {
            if (num < min) min = num;
            if(num>max) max = num;
        }

        System.out.println(min + " "+max);
    }

}

