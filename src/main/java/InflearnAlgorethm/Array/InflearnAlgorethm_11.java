package InflearnAlgorethm.Array;

import java.util.Scanner;


/**
 * 11. 임시반장 정하기
 */
public class InflearnAlgorethm_11 {

    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int solution(int n, int[][] arr) {
        int cnt = 0;
        int answer = 0, max= Integer.MIN_VALUE;
        for(int i=1;i<=n; i++){
            for (int j = 1; j <n; j++) {
                for (int k = 1; k < 5; k++) {
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }

                }
            }
            if(cnt>max){
                max=cnt;
                answer = i;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_11 T = new InflearnAlgorethm_11();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
//        T.solution(n);


        System.out.print(T.solution(n, arr));

    }

}
