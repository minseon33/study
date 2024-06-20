package inflearnAlgorethm.String;

import java.util.Scanner;


/**
 * 5. 특정문자 뒤집기
 * 문제: 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *      특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력: 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 * 예시:
 *      a#b!fw!d@s
 * 에시출력:
 *        s#d!wf!b@a
 */
public class InflearnAlgorethm_5 {
    public String solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() -1;

        while (lt < rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer=String.valueOf(s);//<<클래스.valueOf(s) "s라는 기본형 배열을 String으로 바꿔줌"


        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_5 T = new InflearnAlgorethm_5();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}
