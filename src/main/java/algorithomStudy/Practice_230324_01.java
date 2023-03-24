package algorithomStudy;

import org.springframework.stereotype.Indexed;

import java.util.*;
import java.util.stream.Collectors;

// 크레인 인형뽑기 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/64061
public class Practice_230324_01 {
    //while문 moves 길이만큼 돌려서 일단 board 그린다.
    //moves는 인덱스가 된다. (moves -1)
    // for 돌면서 if(i<5)일때  moves(인덱스) 값으로 인형을 찾는다.
    //만약 인덱스에 있는 인형이 0이면 넘어간다.
    //인형을 찾으면 스택에 담는다.
    //뺀 인형은 0으로 바꿔준다.
    //만약 처음 잡은 인형이면 (스택의 길이가 0이라면)그냥 push만 해주고
    //0이 아니라면 pop한(이전에 담았던 인형) 값이랑 지금 잡은 인형값이랑 비교해서
    //값이 같으면 answer +=2, 같지 않으면 add로 인형을 추가해준다. 마지막에 answer리턴
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        //bord 배열을 어레이 리스트로 바꿔주자.
        //stack에 0을 먼저 넣어줘서 아웃오브인덱스 안나게 하자.
        stack.push(0);
        //moves의 길이만큼 인형을 잡아야하니까 for문이 아니라 while문을 돌려야 한다.
        while(i<moves.length){
            for (int x = 0; x < board.length; x++) {
                if(!(board[x][moves[i]-1]==0)){
                  //만약의 moves가 가르키는 보드의 값이 0이 아니라면 (인형이 잡혔다면)
                    Integer pop = stack.pop();
                    if(pop.equals(board[x][moves[i]-1])){
                        //스택에서 꺼낸 값이랑 인형의 값이랑 같다면
                        // 똑같은거 지우는 인형의 개수를 세어줌
                        answer +=2;
                        //꺼낸 데이터는 0만들기
                        board[x][moves[i]-1] = 0;
                    }else {
                        //스택에서 꺼낸 값이랑 인형의 값이랑 같지 않다면
                        //꺼냈던 스택 다시 집어넣고
                        stack.push(pop);
                        //인형을 스택에 집어넣어줌.
                        stack.push(board[x][moves[i]-1]);
                        //꺼낸 데이터는 0만들기
                        board[x][moves[i]-1] = 0;
                    }
                    //배열의 값은 0으로 바꿈 < 근데 배열은 한번 선언되면 변경이 불가능하잖아...(어레이리스트로 바꿔야겠네..)
                    //(배열사이즈가 변경 불가능한거였다니..!! 데이터값은 변경 가능하다니..! 몰랐네..ㄷㄷ)
                    break;
                }
            }
            i++;
        }

           return answer;
       }

    public static void main(String[] args) {
        Practice_230324_01 t = new Practice_230324_01();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(t.solution(board,moves));
    }
}
