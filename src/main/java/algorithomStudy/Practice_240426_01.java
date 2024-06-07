package algorithomStudy;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 게임 맵 최단거리
 * https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */
public class Practice_240312_03 {


//    static int answer = 0;
//    public static int solution(int[][] maps) {
//        /**
//         * 1. 방문맵의 첫 노드 방문처리
//         * 2. 4개방향 -> 갈 수 있는 길인지, 아닌지 판단 (x+1),(x-1),(y+1),(y-1)
//         * 3. 갈 수 있는 길 큐에 담기
//         * 4. 큐가 비어있지 않으면 (갈수있는 길이 있으면) 큐에서 하나 뽑아서 1번~3번 반복
//         * 5. 갈 수 있는 길이 없으면(큐가 비었으면) -1리턴, 아니면 x,y가 모두 4와 같아지면 탈출
//         * 내가 갔던 길을 어떻게 알지...??
//         */
//        int x = 0;
//        int y = 0;
//        Queue<int[]> queue = new LinkedList<>();
//        int nx = maps[0].length;
//        int ny = maps.length;
//        boolean[][] visited = new boolean[ny][nx];
//        int[][] newvisited = new int[ny][nx];
//        newvisited[0][0]=1;
//        bfs(x, y, maps,newvisited, visited, queue); //bfs 들어간다
//        if(visited[ny-1][nx-1]==true){
//            return answer;
//        }else {
//            return -1;
//        }
//    }
//
//    public static void bfs(int x, int y ,int[][] maps,int[][] newvisited, boolean[][] visited, Queue<int[]> queue){
//        //방문맵의 첫 노드 방문처리
//        visited[y][x]=true; //0,0
//        queue.add(new int[]{y,x}); //-> 0,0의 값을 더해주는거 answer에다가 //queue[1]
//        while (!queue.isEmpty()){ //queue에서 꺼내서(현재 위치 까지의 값을 더한 값) 로직을 돌린다
//            int[] poll = queue.poll(); //1
//            int i = poll[0];
//            int j = poll[1];
//            //갈 수 있는 길인지 아닌지 판단
//            //4개 방향 (x+1),(x-1),(y+1),(y-1)
//            // 아래로 전진
//            if(y<maps.length-1){
//                if(maps[i+1][j]==1 && visited[i+1][j]!=true){
//                    visited[i+1][j]=true;
//                    newvisited[i+1][j]=newvisited[i][j]+1;
//                    queue.offer(new int[]{i+1, j}); //2 .... (11)
//                }
//            }
//            // 오른쪽으로 전진
//            if(x<maps[0].length-1){
//                if(maps[i][j+1]==1 && visited[i][j+1]!=true){
//                    visited[i][j+1]=true;
//                    newvisited[i][j+1]=newvisited[i][j]+1;
//                    queue.offer(new int[]{i, j+1});
//                }
//            }
//            // 위쪽으로 전진
//            if(y>0){
//                if(maps[i-1][j]==1 && visited[i-1][j]!=true){
//                    visited[i-1][j]=true;
//                    newvisited[i-1][j]=newvisited[i][j]+1;
//                    queue.offer(new int[]{i-1, j});
//                }
//            }
//            // 왼쪽으로 전진
//            if(x>0){
//                if(maps[i][j-1]==1 && visited[i][j-1]!=true){
//                    visited[i][j-1]=true;
//                    newvisited[i][j-1]=newvisited[i][j]+1;
//                    queue.offer(new int[]{i,j-1});
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
//
//        int solution = solution(maps);
//        System.out.println("solution :: "+ solution);
//
//    }


    static int answer = 0;
    public static class Node {
        int x;
        int y;
        int currentIndex;

        public Node(int x, int y,int currentIndex) {
            this.x = x;
            this.y = y;
            this.currentIndex = currentIndex;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
        public int getCurrentIndex(){
            return this.currentIndex;
        }
    }
    public int solution(int[][] maps) {
        /**
         * 1. 방문맵의 첫 노드 방문처리
         * 2. 4개방향 -> 갈 수 있는 길인지, 아닌지 판단 (x+1),(x-1),(y+1),(y-1)
         * 3. 갈 수 있는 길 큐에 담기
         * 4. 큐가 비어있지 않으면 (갈수있는 길이 있으면) 큐에서 하나 뽑아서 1번~3번 반복
         * 5. 갈 수 있는 길이 없으면(큐가 비었으면) -1리턴, 아니면 x,y가 모두 4와 같아지면 탈출
         * 내가 갔던 길을 어떻게 알지...??
         */

        Queue<Integer[]> queue = new LinkedList();
        int[][] newVisited = new int[maps[0].length][maps.length];
        boolean[][] visited = new boolean[maps[0].length][maps.length];
        bfs(0,0,maps,newVisited,visited,queue);

        return answer;

    }

    public static void bfs(int x, int y,int[][] maps,int[][] newvisited, boolean[][] visited, Queue<Integer[]> queue){
        // x-> 세로, y-> 가로
        //방문맵의 첫 노드 방문처리
        visited[x][y] = true;
        newvisited[x][y] = 1;

//        queue.offer(new int[1]); //이거 맞나..?


        //queue에서 꺼내서(현재 위치 까지의 값을 더한 값) 로직을 돌린다

            //갈 수 있는 길인지 아닌지 판단

            //4개 방향 (x+1),(x-1),(y+1),(y-1)
            // 아래로 전진

            // 오른쪽으로 전진

            // 위쪽으로 전진

            // 왼쪽으로 전진

    }

    public static void main(String[] args) throws IOException {

        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

//        int solution = solution(maps);
//        System.out.println("solution :: "+ solution);

    }



    
}
