package algorithomStudy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

/**
 * 순서쌍의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120836
 *
 */
public class Practice_240620_01 {

    //내 풀이
    public int solution(int n) throws IOException {
        int answer = 0;
        for (int i = 1; i <= n/2; i++) {
            int quotient = n/i;
            if(n%i == 0 && i < quotient){
                answer+=2;
            }else if (i==quotient){
                answer+=1;
            }
        }

        System.out.println(answer);
        return answer;
    }
    /**
     * solution 테스트 결과
     * --------------------------------------------
     * 테스트 1 〉	실패 (0.02ms, 74.6MB)
     * 테스트 2 〉	통과 (0.03ms, 65.7MB)
     * 테스트 3 〉	실패 (1.22ms, 73.9MB)
     * 테스트 4 〉	통과 (0.02ms, 73.8MB)
     * 테스트 5 〉	실패 (1.21ms, 78MB)
     * 테스트 6 〉	통과 (6.00ms, 75.3MB)
     * 테스트 7 〉	통과 (0.02ms, 77.7MB)
     * 테스트 8 〉	통과 (0.03ms, 73.5MB)
     * 테스트 9 〉	실패 (5.42ms, 76.1MB)
     * 테스트 10 〉	통과 (7.29ms, 75.4MB)
     * --------------------------------------------
     * 채점 결과
     * 정확성: 60.0
     * 합계: 60.0 / 100.0
     */

    public int solution2(int n) throws IOException {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            if(n%i == 0){
                answer+=1;
            }
        }
        System.out.println(answer);
        return answer;
    }

    /**
     * solution2 테스트 결과
     * --------------------------------------------
     * 테스트 1 〉	통과 (0.02ms, 68.6MB)
     * 테스트 2 〉	통과 (0.01ms, 77.1MB)
     * 테스트 3 〉	통과 (2.25ms, 74.2MB)
     * 테스트 4 〉	통과 (0.02ms, 77.6MB)
     * 테스트 5 〉	통과 (1.27ms, 76.3MB)
     * 테스트 6 〉	통과 (4.50ms, 70.6MB)
     * 테스트 7 〉	통과 (0.02ms, 74.1MB)
     * 테스트 8 〉	통과 (0.01ms, 73.6MB)
     * 테스트 9 〉	통과 (4.36ms, 75.4MB)
     * 테스트 10 〉	통과 (4.74ms, 79MB)
     * --------------------------------------------
     * 채점 결과
     * 정확성: 100.0
     * 합계: 100.0 / 100.0
     */

    //다른사람 풀이 따라하기

    public int solution3(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }



    public static void main(String[] args) throws IOException {
        Practice_240620_01 practice = new Practice_240620_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        practice.solution2(num1);
    }
}
