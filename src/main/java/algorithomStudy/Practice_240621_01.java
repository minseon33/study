package algorithomStudy;

import java.io.IOException;
import java.math.BigInteger;

/**
 * 구슬을 나누는 경우의 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 *
 */
public class Practice_240621_01 {

    //내 풀이
    public long solution(int balls, int share) {
        if(balls == share){
            System.out.println("answer: " + 1);
            return 1;
        }
        long answer = 0;
        long factorialBall = computedFactorial(balls,share);
        long computedFactorial = factorial(balls - share);
        answer = factorialBall/computedFactorial;
        System.out.println("answer: " + answer);
        return answer;
    }

    public long factorial(long ball){
        long answer = 1;
        for(long i = ball; i>0;i--){
            answer *= i;
        }

        return answer;
    }
    public long computedFactorial(long ball, long share){
        long answer = 1;
        for(long i = ball; i > share;i--){
            answer *= i;
        }
        return answer;
    }

    /**
     * 흐어~~ 포기...!
     * 고민까지 걸린시간 2시간 반...!
     */
    //다른사람 풀이 따라하기
    public double solution2(int balls, int share) {
        double answer = 1;

        for(int i = 0; i < share; i++){
            answer = answer * (balls - i) / (i+1);
        }
        System.out.println("answer: " + answer);
        return answer;
    }

    public long solution3(int balls, int share) {
        long answer = 0;

        int d = (balls - share) > share ? share : balls - share;
        if (d == 0) return 1;

        return solution3(balls - 1, d - 1) * balls / d;
    }

    public BigInteger solution4(int balls, int share) {
        BigInteger top = BigInteger.ONE;
        BigInteger bom = BigInteger.ONE;
        for(int i=0; i<share; i++){
            top = top.multiply(BigInteger.valueOf(balls-i));
            bom = bom.multiply(BigInteger.valueOf(share-i));
        }
        return top.divide(bom);
    }


    public static void main(String[] args) throws IOException {
        Practice_240621_01 practice = new Practice_240621_01();
        practice.solution(30,15);
        practice.solution2(30,15);
    }
}
