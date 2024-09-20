package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 투포인트 알고리즘 자바 알고리즘 p.56
 * 백준 : https://www.acmicpc.net/problem/2018
 *
 */
public class Practice_240825_02 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        long sum = 1;

        while (endIndex < num) {
            if (sum == num) {
                count++;
                endIndex++;
                sum += endIndex;

            } else if (sum > num) {
                sum -= startIndex;
                startIndex++;
            } else if (sum < num) {
                sum += endIndex;
                endIndex++;
            }
        }
        System.out.println(count);

    }


    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        long sum = 1;

        while (endIndex < num-1) {
            if (sum == num) {
                endIndex++;
                sum += endIndex;
                count++;
            } else if (sum > num) {
                sum -= startIndex;
                startIndex++;
            } else if (sum < num) {
                sum += endIndex;
                endIndex++;
            }
        }
        System.out.println(count);
    }

    //왜 이건 되는것이냐...
    public void solution3() throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        int start = 1;
        int end = 1;
        int sum = 1;

        while(start <= end){
            if(sum == n) answer++;
            if(sum < n){
                end++;
                sum+=end;
            }
            else if(sum >= n){
                sum -= start;
                start++;
            }
        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws IOException {
        Practice_240825_02 practice = new Practice_240825_02();
        practice.solution3();
    }
}


