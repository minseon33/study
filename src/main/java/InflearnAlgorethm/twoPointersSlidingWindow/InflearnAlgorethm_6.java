package InflearnAlgorethm.twoPointersSlidingWindow;
import java.util.Scanner;


/**
 * 5. 연속된 자연수의 합2 (수학 활용)
 */
public class InflearnAlgorethm_6 {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        //cnt 는 연속된 자연수의 개수

        while (n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0){
                answer++;
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        InflearnAlgorethm_6 T = new InflearnAlgorethm_6();
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
