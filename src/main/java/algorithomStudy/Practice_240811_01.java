package algorithomStudy;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 초심으로 돌아가자, 단계별 문제 도장깨기.
 * 단어의 개수
 * 레벨 : 브론즈2
 * https://www.acmicpc.net/problem/1152
 */
public class Practice_240811_01 {


    public static void main(String[] args) throws IOException {
        Practice_240811_01 practice = new Practice_240811_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.equals(" ")) {
            System.out.println(0);
        }else {
            String trim = s.trim();
            String[] split = trim.split(" ");
            System.out.println(split.length);
        }
    }

}

