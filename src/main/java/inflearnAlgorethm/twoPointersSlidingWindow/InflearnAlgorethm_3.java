package InflearnAlgorethm.twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * 3. 최대 매출 ( 슬라이딩 윈도우)
 */
public class InflearnAlgorethm_3 {
    public int solution(int n, int k, int[] a) {

        int answer = 0;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            answer+=a[i];
            sum=answer;
        }

        for (int i = 1; i <a.length ; i++) {
            if(i+(k-1)<a.length) {
                sum -= a[i - 1];
                sum += a[i + (k - 1)];

                answer = Math.max(answer,sum);
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        InflearnAlgorethm_3 T = new InflearnAlgorethm_3();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, a));

    }
}
