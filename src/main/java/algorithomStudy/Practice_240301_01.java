package algorithomStudy;


import java.io.IOException;
import java.util.*;

/**
 *  피보나치 수
 *  https://school.programmers.co.kr/learn/courses/30/lessons/12945
 */
public class Practice_240301_01 {

    public int solution(int n) {
        int b = 0;
        int l = 1;
        int r = 0;


        for (int i = 1; i < n; i++) {
            b = l;
            l = r+l;
            r = b;
        }
        int answer = l+r;
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Practice_230606_01 t = new Practice_230606_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x: t.solution2(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
