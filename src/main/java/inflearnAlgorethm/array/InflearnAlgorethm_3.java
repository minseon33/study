package inflearnAlgorethm.array;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 15. 피보나치 수열
 * 문제: 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *      2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력: 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * 출력: 첫 줄에 피보나치 수열을 출력합니다.
 * 예시:
 *      10
 * 에시출력:
 *        1 1 2 3 5 8 13 21 34 55
 */
public class InflearnAlgorethm_3 {
    public void solution(int n){
        int a=1, b=1, c;
        System.out.println(a + " " + b + " ");
        for (int i = 2; i <n ; i++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }
    public int[] solution2(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i <n ; i++) {
            answer[i]=answer[i-1] + answer[i-2];
        }

        return answer;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_3 T = new InflearnAlgorethm_3();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        T.solution(n);
        System.out.println(Arrays.toString(T.solution2(n)));
    }

}
