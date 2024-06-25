package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 합성수 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120846
 *
 */
public class Practice_240625_01 {

    //내 풀이


    //소수구하기, 에라토스테네스체
    public int solution(int n) {
        int answer = 0;
        boolean[] numberArray = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            numberArray[i]=true;
        }

        for (int i = 2; i < n+1; i++) {
            if(numberArray[i]){
                for (int j = i*i; j <n+1; j = j+i ) {
                    if(numberArray[j]){
                        answer++;
                    }
                    numberArray[j] = false;
                }
            }
        }

        System.out.println("answer : " + answer);
        return answer;
    }

    //다른사람 풀이 따라하기

    public int solution2(int n) {
        int answer = (int) IntStream.rangeClosed(1, n).filter(i -> (int)
                IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();

        System.out.println("answer : " + answer);
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Practice_240625_01 practice = new Practice_240625_01();
        practice.solution(15);
        practice.solution2(10);
    }
}
