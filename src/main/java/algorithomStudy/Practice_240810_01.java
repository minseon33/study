package algorithomStudy;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 초심으로 돌아가자, 단계별 문제 도장깨기.
 * 공 바꾸기
 * 레벨 : 브론즈2
 * https://www.acmicpc.net/problem/10813
 */
public class Practice_240810_01 {


    public static void main(String[] args) throws IOException {
        Practice_240810_01 practice = new Practice_240810_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[m + 1];
        int x,y,tmp;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            x = Integer.parseInt(s.nextToken());
            y = Integer.parseInt(s.nextToken());

            tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <m+1 ; i++) {
            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();
        }


    }

