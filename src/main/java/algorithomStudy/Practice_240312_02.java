package algorithomStudy;


import java.io.IOException;
import java.util.Stack;

/**
 * 타겟넘버
 * https://school.programmers.co.kr/learn/courses/30/lessons/43165
 */
public class Practice_240312_01 {

    /**
     * dfs
     */
    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        int computation = 0;
        int selection = 0;
        dfs(computation,target,numbers,selection);
        return answer;
    }

    public static int dfs(int computation ,int target ,int[] numbers ,int selection){
        //탈출조건
        //연결조건
        //시작조건
        if(selection==numbers.length){
            if(computation == target){
                return answer++;
            }
        }else {
            dfs(computation+numbers[selection],target,numbers,selection+1);
            dfs(computation-numbers[selection],target,numbers,selection+1);
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        solution(numbers,target);
        System.out.println("answer :: " + answer);

    }
}
