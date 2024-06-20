package InflearnAlgorethm.SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 5. 중복확인
 */
public class InflearnAlgorethm_5 {

    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);

        for (int i = 1; i <n ; i++) {
            if(arr[i]==arr[i-1]){
                return "D";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_5 T = new InflearnAlgorethm_5();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= kb.nextInt();
        }

        System.out.println(T.solution(n,arr));

    }


}
