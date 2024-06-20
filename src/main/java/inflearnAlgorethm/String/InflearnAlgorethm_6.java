package InflearnAlgorethm.String;

import java.util.Scanner;


/**
 * 6. 중복문자 제거
 * 문제: 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *      중복이 제거된 문자열의 각 문자는 워래 문자열의 순서를 유지합니다.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력: 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * 예시:
 *      ksekkset
 * 에시출력:
 *        kset
 */
public class InflearnAlgorethm_6 {
    public String solution(String str){
        String answer = "";
       for(int i=0; i<str.length();i++){
           if(i == str.indexOf(str.charAt(i))){
               answer+=str.charAt(i);
           }
       }
        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_6 T = new InflearnAlgorethm_6();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}
