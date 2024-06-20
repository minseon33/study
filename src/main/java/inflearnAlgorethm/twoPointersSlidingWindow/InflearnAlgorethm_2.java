package inflearnAlgorethm.twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * 2. 공통 원소 구하기 (투포인터 알고리즘)
 */
public class InflearnAlgorethm_2 {
    public ArrayList<Integer> solution(int n, int m , int[] a, int[] b) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        Arrays.sort(a);
        Arrays.sort(b);

        while (p1<n && p2<m){
            if(a[p1]==b[p2]){
                answer.add(a[p1]);
                p1++;
                p2++;
            } else if(a[p1]<b[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        InflearnAlgorethm_2 T = new InflearnAlgorethm_2();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        for (int x:T.solution(n,m,a, b)){
            System.out.print(x + " ");
        }

    }
}
