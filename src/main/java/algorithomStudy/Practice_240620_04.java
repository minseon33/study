package algorithomStudy;
import java.io.*;
import java.util.StringTokenizer;

/**
 * 두 수 비교하기
 * https://www.acmicpc.net/problem/10172
 *
 */
public class Practice_240620_04 {

    //내 풀이
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        System.out.println("a :: "+ a );
        System.out.println("b :: "+ b );
        if(a>b){
            System.out.println(">");
        } else if (a<b) {
            System.out.println("<");
        } else if (a==b) {
            System.out.println("==");
        }
    }

    /**
     * 결과 :
     * 메모리 : 	14124KB
     * 시간 : 108ms
     */
    //다른사람 풀이 따라하기
    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append((A>B) ? ">" : ((A<B) ? "<" : "=="));
        System.out.println(sb);
    }

    /**
     * 결과 :
     * 메모리 : 14108KB
     * 시간 : 104ms
     */


    public static void main(String[] args) throws IOException {
        Practice_240620_04 practice = new Practice_240620_04();
        practice.solution();
        practice.solution2();
    }
}
