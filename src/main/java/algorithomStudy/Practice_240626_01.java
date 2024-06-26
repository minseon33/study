package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.SimpleTimeZone;
import java.util.StringTokenizer;

/**
 * 소수 찾기
 * https://www.acmicpc.net/problem/1978
 *
 */
public class Practice_240626_01 {

    //내 풀이

    public boolean validatePrimeNumber(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i= 0; i<a; i++){
            int tk = Integer.parseInt(st.nextToken());
            if(tk!=1 && validatePrimeNumber(tk)){
                count++;
            }
        }
        System.out.println(count);


    }

    /**
     * 결과 :
     * 메모리 : 	14140KB
     * 시간 : 104ms
     */

    public static void main(String[] args) throws IOException {
        Practice_240626_01 practice = new Practice_240626_01();
        practice.solution();
    }
}
