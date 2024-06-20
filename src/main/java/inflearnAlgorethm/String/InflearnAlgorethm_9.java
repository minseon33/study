package InflearnAlgorethm.String;

import java.util.Scanner;


/**
 * 9. 숫자만 추출
 * 문제: 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *      만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 *      추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 * 입력: 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * 출력: 첫 줄에 자연수를 출력합니다.
 * 예시:
 *      g0en2T0s8eSoft
 * 에시출력:
 *        208
 */
public class InflearnAlgorethm_9 {
    //아스키 넘버로 하기
    public int solution(String str){
        int answer = 0;
        for(char x : str.toCharArray()){
            if(x>=48 && x<=57){
                answer=answer*10+(x-48);
            }
        }

        return answer;
    }

    //String으로 하기
    public int solution2(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                answer+=x;
            }
        }

        //스트링을 정수로 바꿔주는것
        return Integer.parseInt(answer);
    }




    public static void main(String[] args) {
        InflearnAlgorethm_9 T = new InflearnAlgorethm_9();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution("g0en2T0s8eSoft"));
    }

}
