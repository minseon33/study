package InflearnAlgorethm.Array;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 13. 큰 수 출력하기
 * 문제: N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 *      (첫 번째 수는 무조건 출력한다)
 * 입력: 첫 줄에 자연수 N(1<=N<=100)
 * 출력: 첫 줄에 자연수 N(1<=N<=100)
 * 예시:
 *      6
 *      7 3 9 5 6 12
 * 에시출력:
 *        7 9 6 12
 */
public class InflearnAlgorethm_1 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i<n; i++){
            if(arr[i] > arr[i-1]){
                answer.add(arr[i]);
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_1 T = new InflearnAlgorethm_1();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x  : T.solution(n,arr)){
            System.out.println(x + " ");
        }


    }

}
