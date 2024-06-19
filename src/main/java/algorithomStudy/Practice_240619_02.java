package algorithomStudy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 꼬마 정민
 * https://www.acmicpc.net/problem/11382
 */
public class Practice_240619_02 {

    //내 풀이
    public void solution() throws IOException {
        long answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number =br.readLine();
        String[] split = number.split(" ");
        for (String s:split) {
            if(!s.isBlank()){
                String trim = s.trim();
                Long.parseLong(trim);
            }
        }
        System.out.println(answer);
    }

    //다른사람 풀이 따라하기
    public void solution2() throws IOException {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);
    }

    public void solution3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        System.out.println(A + B + C);
    }


    public static void main(String[] args) throws IOException {
        Practice_240619_02 practice = new Practice_240619_02();
//        practice.solution();
        practice.solution3();
    }
}
