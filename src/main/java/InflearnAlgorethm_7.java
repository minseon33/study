import java.util.Scanner;


/**
 * 7. 회문 문자열
 * 문제: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *      문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 *      단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력: 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * 예시:
 *      gooG
 * 에시출력:
 *        YES
 */
public class InflearnAlgorethm_7 {
    //직접 교환
    public String solution(String str){
        String answer = "YES";
        int len = str.length();
        str = str.toUpperCase();

        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!= str.charAt(len-i-1)){
                answer = "NO";
                return answer;
            }
        }
        return answer;
    }

    //스트링빌더 사용하기
    public String solution2(String str){
        String answer = "NO";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();


        if(str.equalsIgnoreCase(tmp)){
            return answer="YES";
        }
        return answer;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_7 T = new InflearnAlgorethm_7();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));
    }

}
