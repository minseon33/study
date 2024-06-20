package inflearnAlgorethm.String;

import java.util.Scanner;


/**
 * 3. 문장 속 단어
 * 문제: 한개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요
 *      문장속의 각 단어는 공백으로 구분됩니다.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 출력: 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 * 예시: it is time to study.
 * 에시출력: study
 */
public class InflearnAlgorethm_3 {
    public String solution(String str){
        //1. 들어온 문자열의 문자를 공백을 기준으로 잘라서 ArrayList에 담는다.
        //2. for문을 돌려서 count 숫자보다 길이가 크면 result에 저장한다.

        int max = Integer.MIN_VALUE;
        String result = "";
        //1. 들어온 문자열의 문자를 공백을 기준으로 잘라서 List에 담는다.
        String[] s = str.split(" ");
        //2. for문을 돌려서 count 숫자보다 길이가 크면 result에 저장한다.
        for (String x : s) {
            int len = x.length();
            if (len > max) {
                max = len;
                result = x;
            }
        }

        System.out.println("결과 = result.toString() : " + result);

//        return result2.toString();
        return result.toString();
    }
    public String solution2(String str){
        //indexOf 랑 subString 사용해서 풀어보기
        int max = Integer.MIN_VALUE, pos;
        String result = "";
        while ((pos = str.indexOf(" ")) != -1){
            String tmp = str.substring(0,pos);
            int len=tmp.length();
            if(len>max){
                max=len;
                result=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length() > max){
            result = str;
        }
        return result;
    }

    public static void main(String[] args) {
        InflearnAlgorethm_3 T = new InflearnAlgorethm_3();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine(); //next()랑 nextLine() 차이가 뭔지..?
        //2. 함수실행
        System.out.println(T.solution2(a));
    }

}
