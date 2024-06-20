package inflearnAlgorethm.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 10. 마굿간 정하기
 */
public class InflearnAlgorethm_10 {
    public int count(int[] arr,int dist){
        int cnt = 1;
        int ep=arr[0];

        for(int i=1; i <arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];

            }
        }


        return cnt;
    }
    public int solution(int n, int m ,int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt=1;
        int rt=arr[n-1];

        while (lt<=rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid)>=m){
                answer=mid;
                lt=mid+1;
            }else{
                rt=mid-1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_10 T = new InflearnAlgorethm_10();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= kb.nextInt();
        }

        System.out.println(T.solution(n,m,arr));

    }


}
