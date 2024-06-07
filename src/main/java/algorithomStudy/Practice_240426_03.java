package algorithomStudy;
import java.io.IOException;

/**
 * 약수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928#qna
 */
public class Practice_240426_03 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            int result = n % i;
            if(result==0){
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        int s = 12;
        int s1 = 5;
        System.out.println(solution(s1));

    }



    
}
