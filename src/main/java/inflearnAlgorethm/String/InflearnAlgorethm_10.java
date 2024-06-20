package inflearnAlgorethm.String;

import java.util.Scanner;


/**
 * 10. 숫자만 추출
 * 문제: 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 입력: 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 *      문자열의 길이는 100을 넘지 않는다.
 * 출력: 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * 예시:
 *      teachermode e
 * 에시출력:
 *        1 0 1 2 1 0 1 2 2 1 0
 */
public class InflearnAlgorethm_10 {
    //아스키 넘버로 하기
    public int[] solution(String str,char c){
        int[] answer= new int[str.length()];
        int p = 1000;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==c){
                p=0;
                answer[i] = p;
            }else {
                p++;
                answer[i]=p;
            }
        }

        p=1000;
        for (int i=str.length()-1; i>=0; i--){
            if (str.charAt(i)==c) {
                p=0;
            }else {
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_10 T = new InflearnAlgorethm_10();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(str,c)){
            System.out.println(x + " ");
        }

    }

}
