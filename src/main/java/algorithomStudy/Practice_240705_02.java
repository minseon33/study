package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 재귀의 귀재
 * https://www.acmicpc.net/problem/25501
 */
public class Practice_240705_02 {

    public int recursionCount = 0;

    public int recursion(String s, int l, int r) {
        recursionCount++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else {
            return recursion(s, l + 1, r - 1);
        }
    }

    public int isPalindrome(String s) {
        recursionCount = 0;
        return recursion(s, 0, s.length() - 1);
    }
    //내 풀이
    //재귀연습

    public void solution() throws IOException, ArrayIndexOutOfBoundsException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i]=br.readLine();
        }
        for (String s:arr) {
            int palindrome = isPalindrome(s);
            System.out.println(palindrome + " "+ recursionCount);
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
        Practice_240705_02 practice = new Practice_240705_02();
        practice.solution();
        practice.solution2();

    }
}
