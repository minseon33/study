package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 초심으로 돌아가자, 단계별 문제 도장깨기.
 * 최댓값
 * 레벨 : 브론즈3
 * https://www.acmicpc.net/problem/2562
 */
public class Practice_240726_02 {


    public static void main(String[] args) throws IOException {
        Practice_240726_02 practice = new Practice_240726_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);
    }

}

