package InflearnAlgorethm.SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * 6. 장난꾸러기
 */
public class InflearnAlgorethm_6 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if(arr[i]!= tmp[i]){
                answer.add(i+1);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_6 T = new InflearnAlgorethm_6();
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
