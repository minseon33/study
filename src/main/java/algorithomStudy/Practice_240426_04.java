package algorithomStudy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 약수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928#qna
 */
public class Practice_240426_04 {
    public static String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] split = s.split(" ");
        for (String s1 :split) {
            int i = Integer.parseInt(s1);
            if(i<min){
                min = i;
            }
            if(i>max){
                max=i;
            }
        }
        answer = min +" "+max;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String s = "1 2 3 4";
        String s1 = "-1 -2 -3 -4";
        System.out.println(solution(s));

    }



    
}
