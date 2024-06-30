package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 대표값2
 * https://www.acmicpc.net/problem/2587
 */
public class Practice_240630_01 {


    //내 풀이
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }

        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[2]);
    }

    /**
     * 결과 :
     * 메모리 : 14124KB
     * 시간 : 104ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] nums = new int[5];
        int avg = 0;
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            avg += nums[i];
        }
        Arrays.sort(nums);
        avg = avg / 5;
        sb.append(avg).append("\n").append(nums[2]);
        System.out.print(sb);

    }


    public static void main(String[] args) throws IOException {
        Practice_240630_01 practice = new Practice_240630_01();
        practice.solution();
        practice.solution2();
    }
}
