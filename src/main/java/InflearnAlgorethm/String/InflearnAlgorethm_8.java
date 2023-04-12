package InflearnAlgorethm.String;

import java.util.Scanner;


/**
 * 8. 유효한 팰린드롬
 * 문제: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 *      문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 팰린드롬이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 *      단 팰린드롬을 검사할 때 알파벳만 가지고 회문을 검사하며. 대소문자를 구분하지 않습니다.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력: 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * 예시:
 *      found7, time: study; Yduts; emit, 7Dnuof
 * 에시출력:
 *        YES
 */
public class InflearnAlgorethm_8 {
    //직접 교환
    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }




    public static void main(String[] args) {
        InflearnAlgorethm_8 T = new InflearnAlgorethm_8();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}
