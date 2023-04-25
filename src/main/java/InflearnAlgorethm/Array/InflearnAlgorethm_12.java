package InflearnAlgorethm.Array;

import java.util.Scanner;


/**
 * 12. 멘토링
 */
public class InflearnAlgorethm_12 {

    public int solution(int n, int m, int[][] arr) {
        int cnt = 0;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if(cnt==m){
                    answer++;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_12 T = new InflearnAlgorethm_12();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
//        T.solution(n);


        System.out.print(T.solution(n, m, arr));

    }

}
