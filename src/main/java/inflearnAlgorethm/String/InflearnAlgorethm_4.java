package InflearnAlgorethm.String;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 4. 단어 뒤집기
 * 문제: N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하시오.
 * 입력: 첫 줄에 자연수 N(3<= N <=20)이 주어집니다.
 *      두번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * 출력: N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * 예시:
 *      3
 *      good
 *      Time
 *      Big
 * 에시출력:
 *          doog
 *          emiT
 *          giB
 */
public class InflearnAlgorethm_4 {
    public ArrayList<String> solution(int n , String[] str){

        //StringBuilder 사용해서 한 풀이
        ArrayList<String> answer = new ArrayList<String>();

        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
    public ArrayList<String> solution2(int n , String[] str){
        //직접 뒤집기
        ArrayList<String> answer = new ArrayList<String>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt=x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        InflearnAlgorethm_4 T = new InflearnAlgorethm_4();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        String[] str = new String[n];
        for (int i=0;i<n;i++){
            str[i] = kb.next();
        }
        for(String x :T.solution2(n,str)){
            System.out.println(x);
        }
    }

}
