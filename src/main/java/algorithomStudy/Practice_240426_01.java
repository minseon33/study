package algorithomStudy;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 문자열 내 p와 y의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class Practice_240426_01 {
    public static boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        s = s.toUpperCase();
        char[] sCharArray = s.toCharArray();
        for (char c:sCharArray) {
            if(String.valueOf(c).equals("P")){
                pCount++;
            } else if (String.valueOf(c).equals("Y")) {
                yCount++;
            }
        }
        if(pCount!=yCount){
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String s = "pPoooyY";
        String s1 = "Pyy";
        System.out.println(solution(s1));

    }



    
}
