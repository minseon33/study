package inflearnAlgorethm.array;

import java.util.Scanner;


/**
 * 20.  격자판 최대 합
 */
public class InflearnAlgorethm_9 {
    public int solution(int n, int[][] arr) {
        int cnt = 0;
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1=sum2=0;
            for (int j = 0; j < n; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }

        sum1=sum2=0;
        for (int i = 0; i < n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_9 T = new InflearnAlgorethm_9();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
//        T.solution(n);


        System.out.print(T.solution(n, arr));

    }

}
