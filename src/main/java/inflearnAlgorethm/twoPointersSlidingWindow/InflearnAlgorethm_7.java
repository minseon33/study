package inflearnAlgorethm.twoPointersSlidingWindow;

import java.util.Scanner;


/**
 * 6. 최대길이 연속부분 수열
 */
public class InflearnAlgorethm_7 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;

            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;

    }


    public static void main(String[] args) {
        InflearnAlgorethm_7 T = new InflearnAlgorethm_7();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, a));
    }
}
