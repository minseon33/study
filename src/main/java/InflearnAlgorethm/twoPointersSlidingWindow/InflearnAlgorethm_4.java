package InflearnAlgorethm.twoPointersSlidingWindow;
import java.util.Scanner;


/**
 * 4. 연속 부분수열
 */
public class InflearnAlgorethm_4 {
    public int solution(int n, int k, int[] a) {
        //내가 푼 풀이

        int answer = 0;
        int sum = 0;
        int p1 = 0;
        int p2 = 0;
        while (p1<n){
            if(p2 > a.length-1){
                p1++;
                p2 = p1;
                sum=0;
            }else {
                if(sum>k){
                    p1++;
                    p2 = p1;
                    sum=0;
                } else if (sum == k) {
                    p1++;
                    p2 = p1;
                    answer++;
                    sum=0;
                }else {
                    sum+=a[p2];
                    p2++;
                }
            }
        }

        return answer;

    }


    public int solution2(int n, int m, int[] arr) {
        //선생님 풀이

        int answer = 0;
        int sum = 0;
        int lt = 0;

        for(int rt = 0; rt<n;rt++){
            sum+=arr[rt];
            if(sum==m){
                answer++;
            }
            while (sum>=m){
                sum-=arr[lt++];
                if(sum==m){
                    answer++;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        InflearnAlgorethm_4 T = new InflearnAlgorethm_4();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        System.out.println(T.solution2(n, m, a));

    }
}
