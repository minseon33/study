package InflearnAlgorethm.Array;

import java.util.Scanner;


/**
 * 16. 소수(에라토스테네스 체)
 * 문제: 1) 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 *      2) 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 * 입력: 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * 출력: 첫 줄에 소수의 개수를 출력합니다.
 * 예시:
 *      20
 * 에시출력:
 *        8
 */
public class InflearnAlgorethm_5 {
    public int solution(int n){
        int count = 0;
        int[] arr = new int[n+1];
        for (int i = 2; i <n ; i++) {
            if(arr[i]==0){
                count ++;
                for(int j=i; j<=n ; j=j+i){
                    arr[j]=i;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_5 T = new InflearnAlgorethm_5();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        T.solution(n);
        System.out.println(T.solution(n));
    }

}
