package algorithomStudy;

import java.io.IOException;
import java.util.Arrays;


/**
 * 투포인트 알고리즘 자바 알고리즘 p.56
 * 백준 : https://www.acmicpc.net/problem/2018
 *
 */
public class Practice_240826_02 {

    public int solution(int n) throws IOException {
        int answer;
        StringBuilder numString = new StringBuilder();

        int i = 1;
        while (numString.length()<n){
            numString.append(String.valueOf(i));
            i++;
        }
        char c = numString.charAt(n - 1);
//        answer = Character.getNumericValue(numString.charAt(n - 1));
        answer = c-'0';
        return answer;
    }




    public static void main(String[] args) throws IOException {
        Practice_240826_02 practice = new Practice_240826_02();
        int a = 1000000000;
        System.out.println(practice.solution(a));
    }
}


