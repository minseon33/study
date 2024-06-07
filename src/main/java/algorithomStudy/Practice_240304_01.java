package algorithomStudy;


import java.io.IOException;
import java.util.Stack;

/**
 * 네트워크
 * https://school.programmers.co.kr/learn/courses/30/lessons/43162
 */
public class Practice_240304_01 {

    /**
     * 런타임 에러 생김.. 근데 어떻게 동작하는지는 알 것 같음...
     * @param n
     * @param computers
     * @return
     */
    public static int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <computers.length; i++){
            if(visited[i]){
                continue;
            }

            stack.push(i);
            answer++;

            while (!stack.isEmpty()){
                int cur = stack.pop();

                if(visited[cur]){
                    continue;
                }

                visited[cur] = true;

                int[] computer = computers[cur];

                for(int j = 0; j<computer.length;j++){
                    if(visited[j] || computer[j]==0){
                        continue;
                    }
                    stack.push(j);
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        int arr[][] = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(3,arr));


    }
}
