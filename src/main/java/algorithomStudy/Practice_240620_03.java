package algorithomStudy;
import java.io.IOException;

/**
 * 개
 * https://www.acmicpc.net/problem/10172
 *
 */
public class Practice_240620_03 {

    //내 풀이
    public void solution() throws IOException {
        StringBuilder br = new StringBuilder();
        br.append("|\\_/|")
                .append("\n")
                .append("|q p|   /}")
                .append("\n")
                .append("( 0 )\"\"\"\\")
                .append("\n")
                .append("|\"^\"`    |")
                .append("\n")
                .append("||_/=\\\\__|");

        System.out.println(br.toString());
    }

    /**
     * 결과 :
     * 메모리 : 	13972KB
     * 시간 : 116ms
     */
    //다른사람 풀이 따라하기
    public void solution2() throws IOException {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }

    /**
     * 결과 :
     * 메모리 : 14168KB
     * 시간 : 132ms
     */


    public static void main(String[] args) throws IOException {
        Practice_240620_03 practice = new Practice_240620_03();
        practice.solution();
        practice.solution2();
    }
}
