package algorithomStudy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 곱셈
 * https://www.acmicpc.net/problem/2588
 */
public class Practice_240619_01 {

    //내 풀이
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int answer = 0;
        String s = String.valueOf(num2);
        String[] split = s.split("");
        for (int i = 0, j= split.length-1; i < split.length; i++,j--) {
            String s1 = split[j];
            int pow = (int)(Math.pow(10, i)+0.001);
            int v = (int) (Integer.parseInt(s1)* num1);
            System.out.println(v);
            answer+=v*pow;
        }
        System.out.println(answer);

    }

    //다른사람 풀이 따라하기

    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String b = st.nextToken();

        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }


    public static void main(String[] args) throws IOException {
        Practice_240619_01 practice = new Practice_240619_01();
        practice.solution();
        practice.solution2();
    }









}
