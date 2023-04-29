package InflearnAlgorethm.HashMapTreeSet;

import java.util.*;


/**
 * 3. 모든 아나그램 찾기
 */
public class InflearnAlgorethm_5 {
    public int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i<n; i++){
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l <n ; l++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x:Tset) {
            cnt++;
            if(cnt == k){
                return x;
            }
        }
        return answer;

    }

    public int solution2(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i<n; i++){
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l <n ; l++) {
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x:Tset) {
            cnt++;
            if(cnt == k){
                return x;
            }
        }
        return answer;

    }




    public static void main(String[] args) {
        InflearnAlgorethm_5 T = new InflearnAlgorethm_5();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution2(n, k, arr));

    }
}
