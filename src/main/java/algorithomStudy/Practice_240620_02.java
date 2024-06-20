package algorithomStudy;
import java.io.IOException;

/**
 * 고양이
 * https://www.acmicpc.net/problem/10171
 *
 */
public class Practice_240620_02 {

    //내 풀이
    public void solution() throws IOException {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    /**
     * 결과 :
     * 메모리 : 	13884KB
     * 시간 : 120ms
     */
    //다른사람 풀이 따라하기
    public void solution2() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("\\    /\\")
                .append("\n")
                .append(" )  ( ')")
                .append("\n")
                .append("(  /  )")
                .append("\n")
                .append(" \\(__)|")
                .append("\n");
        System.out.println(sb.toString());
    }

    /**
     * 결과 :
     * 메모리 : 11312KB
     * 시간 : 60ms
     */


    public static void main(String[] args) throws IOException {
        Practice_240620_02 practice = new Practice_240620_02();
        practice.solution();
        practice.solution2();
    }
}
