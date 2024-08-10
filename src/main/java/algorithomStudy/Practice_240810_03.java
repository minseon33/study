package algorithomStudy;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 초심으로 돌아가자, 단계별 문제 도장깨기.
 * 문자열 반복
 * 레벨 : 브론즈2
 * https://www.acmicpc.net/problem/2675
 */
public class Practice_240810_03 {


    public static void main(String[] args) throws IOException {
        Practice_240810_03 practice = new Practice_240810_03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; i++) {
            String result = "";
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            char[] charArray = s.toCharArray();
            for (char c:charArray) {
                String charAsString = String.valueOf(c);
                String repeat = charAsString.repeat(r);
                result += repeat;
            }
            System.out.println(result);
        }
    }

}

