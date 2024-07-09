package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 제로
 * https://www.acmicpc.net/problem/10773
 */
public class Practice_240709_02 {


    //내 풀이
    //스택연습
    public void solution() throws IOException, ArrayIndexOutOfBoundsException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Integer[] array = new Integer[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i]=Integer.parseInt(br.readLine());
        }
        for (int num:array) {
            if(num!=0){
                stack.push(num);
            }else {
                stack.pop();
            }
        }
        for (int i = 0; i < n; i++) {
            if(!stack.isEmpty()){
                sum+=stack.pop();
            }else{
                break;
            }
        }
        System.out.println(sum);
    }


    /**
     * 결과 :
     * 메모리 : 20872KB
     * 시간 : 268ms
     */


    //다른 사람 풀이
    public void solution2() throws IOException {


    }

    /**
     * 결과 :
     * 메모리 : 25844KB
     * 시간 : 336ms
     */
    public static void main(String[] args) throws IOException {
        Practice_240709_02 practice = new Practice_240709_02();
        practice.solution();
        practice.solution2();

    }
}
