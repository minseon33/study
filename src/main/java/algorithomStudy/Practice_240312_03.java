package algorithomStudy;
import java.io.IOException;

/**
 * 네트워크
 * https://school.programmers.co.kr/learn/courses/30/lessons/43162
 */
public class Practice_240312_02 {
    static int network = 0;
    public static int solution(int n, int[][] computers) {
        boolean visited[] = new boolean[n];
        //여기서 x 돌고 얘는 세로
        for (int x = 0; x < computers.length; x++) {
            if(!visited[x]){
                dfs(x,computers,visited);
                network++;
            }
        }
        return network;
    }

    public static void dfs(int x, int[][] computers,boolean[] visited){
        //여기서 y 돌자 얘는 가로..
        visited[x] = true;
        for (int y = 0; y < computers.length; y++) {
            if(x!=y && computers[y][x]==1){
                if(!visited[y]){
                    dfs(y,computers,visited);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int[][] numbers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int n = 3;
        solution(n,numbers);
        System.out.println("network :: " + network);

    }
    
}
