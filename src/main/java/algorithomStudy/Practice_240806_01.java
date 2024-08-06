package algorithomStudy;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 초심으로 돌아가자, 단계별 문제 도장깨기.
 * 공 넣기
 * 레벨 : 브론즈3
 * https://www.acmicpc.net/problem/10810
 */
public class Practice_240806_01 {


    public static void main(String[] args) throws IOException {
        Practice_240806_01 practice = new Practice_240806_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[m + 1];
        int x,y,z;

        for (int i = 0; i < n; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            x = Integer.parseInt(s.nextToken());
            y = Integer.parseInt(s.nextToken());
            z = Integer.parseInt(s.nextToken());

            for (int j = x; j <=y ; j++) {
                arr[j]=z;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <m+1 ; i++) {
            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();

        }


    }

