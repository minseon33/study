package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택
 * https://www.acmicpc.net/problem/10828
 */
public class Practice_240709_01 {


    //내 풀이
    //스택연습

    public void solution() throws IOException, ArrayIndexOutOfBoundsException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i]=br.readLine();
        }

        for (String ss:array) {
            String[] split = ss.split(" ");
            if (split[0].equals("push")){
                stack.push(Integer.parseInt(split[1]));
            }else if (ss.equals("pop")) {
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                }else {
                    System.out.println(-1);
                }
            } else if (ss.equals("size")) {
                System.out.println(stack.size());
            } else if (ss.equals("empty")) {
                if (stack.isEmpty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            } else if (ss.equals("top")) {
                if (stack.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.peek());
                }
            }
        }
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
        Practice_240709_01 practice = new Practice_240709_01();
        practice.solution();
        practice.solution2();

    }
}
