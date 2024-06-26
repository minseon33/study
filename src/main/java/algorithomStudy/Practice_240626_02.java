package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 수 정렬하기
 * https://www.acmicpc.net/problem/2750
 *
 */
public class Practice_240626_02 {


    //내 풀이
    public boolean isPrimes(int number){
        for(int i = 2; i<number; i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }

    public void solution() throws IOException {
        HashMap<String,Integer> map = new HashMap<>();
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = lowercase.toUpperCase();
        int number = 0;
        int sum = 0;
        for (char c:lowercase.toCharArray()) {
            map.put(String.valueOf(c),++number);
        }

        for (char c:uppercase.toCharArray()) {
            map.put(String.valueOf(c),++number);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        for (char c:a.toCharArray()) {
            sum += map.get(String.valueOf(c));
        }

        if(isPrimes(sum)){
            System.out.println("It is a prime word.");
        }else {
            System.out.println("It is not a prime word.");
        }

    }

    /**
     * 결과 :
     * 메모리 : 	14192KB
     * 시간 : 124ms
     */



    //다른 사람 풀이

    public boolean isPrime(int n){
        if(n == 2){
            return true;
        }else{
            for(int i=2; i<n; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        }

    }
    public void solution2() throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        int sum =0;
        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                sum += s.charAt(i) - 96;
            }else{
                sum += s.charAt(i) - 38;
            }
        }
        if(isPrime(sum)) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");


    }

    public static void main(String[] args) throws IOException {
        Practice_240626_02 practice = new Practice_240626_02();
        practice.solution();
        practice.solution2();
    }
}
