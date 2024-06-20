package inflearnAlgorethm.array;

import java.util.Scanner;


/**
 * 10. 봉우리
 */
public class InflearnAlgorethm_10 {

    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int solution(int n, int[][] arr) {
        int cnt = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_10 T = new InflearnAlgorethm_10();
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
