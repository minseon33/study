package algorithomStudy;

import java.io.IOException;


/**
 * 배낭문제..
 * 백준 : https://www.acmicpc.net/problem/2018
 *
 */
public class Practice_240826_03 {
public static int result = 0;
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
        Practice_240826_03 practice = new Practice_240826_03();
        int a = 1000000000;
        System.out.println(practice.solution(a));
    }
}


