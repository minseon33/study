package algorithomStudy;
import java.io.IOException;

/**
 * 문자열을 정수로 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */
public class Practice_240426_02 {
    public static int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        String s = "1234";
        String s1 = "-1234";
        System.out.println(solution(s1));

    }



    
}
