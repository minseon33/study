package InflearnAlgorethm.twoPointersSlidingWindow;
import java.util.Scanner;


/**
 * 5. 연속된 자연수의 합
 */
public class InflearnAlgorethm_5 {
    public int solution(int n) {
        //내가 푼 풀이

        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=i+1;
        }
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int rt = 0;

        while (rt<n){
            if(sum == n){
                answer++;
                sum-=arr[lt];
                lt++;
            } else if (sum<n) {
                sum+=arr[rt];
                rt++;
            } else if (sum>n) {
                sum-=arr[lt];
                lt++;
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        InflearnAlgorethm_5 T = new InflearnAlgorethm_5();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = kb.nextInt();
//        }

        System.out.println(T.solution(n));

    }
}
