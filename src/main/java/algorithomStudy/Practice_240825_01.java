package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * java 알고리즘 책 p.44
 * 구간 합 구하기 
 * 백준 : https://www.acmicpc.net/problem/11659
 */
public class Practice_240825_01 {


    // 내가 푼 풀이
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer arrSt = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrSt.nextToken());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer sumSt = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(sumSt.nextToken())-1;
            int endIndex = Integer.parseInt(sumSt.nextToken())-1;
            int result = 0;

            for (int j = startIndex; j <= endIndex ; j++) {
                result += arr[j];
            }
            System.out.println(result);
        }
    }

    //교재 해설
    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] sumArr = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i - 1] + arr[i];
        }


        for (int i = 1; i < m+1; i++) {
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[endIndex]-sumArr[startIndex-1]);
        }
    }

    public static void main(String[] args) throws IOException {
        Practice_240825_01 practice = new Practice_240825_01();
        practice.solution2();
    }



}

