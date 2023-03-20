import java.util.ArrayList;
import java.util.Scanner;


/**
 * 2. 대소문자 변환
 * 문제: 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * 입력: 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *      문자열은 영어 알파벱으로만 구성되어있습니다.
 * 출력: 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */
public class InflearnAlgorethm_2 {
    public String solution(String str){
        //1. 들어온 문자열의 문자를 하나하나 for문 돌면서
        //2. 문자가 대문자인지 소문자인지 비교해서 바꿔준다.
        //3. 바꿔준 문자를 AttyList에 저장.

//        ArrayList result = new ArrayList();
        String result = "";
        StringBuffer result2 = new StringBuffer();

        //향상된 for문

        for (char x:str.toCharArray()) {
            if(Character.isUpperCase(x)){
                result2.append(Character.toLowerCase(x));
                result+=Character.toLowerCase(x);
            }else {
                result2.append(Character.toUpperCase(x));
                result+=Character.toUpperCase(x);
            }
        }

        System.out.println("결과 = result2.toString() : " + result2);
        System.out.println("결과2 = result.toString() : " + result);

//        return result2.toString();
        return result;
    }

    public static void main(String[] args) {
        InflearnAlgorethm_2 T = new InflearnAlgorethm_2();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine(); //next()랑 nextLine() 차이가 뭔지..?
        //2. 함수실행
        System.out.println(T.solution(a));
    }
}
