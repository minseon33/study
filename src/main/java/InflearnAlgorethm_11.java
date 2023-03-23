import java.util.Scanner;


/**
 * 11. 문자열 압축
 * 문제: 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *      문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *      단 반복횟수가 1인 경우 생략합니다.
 * 입력: 문자열의 길이는 100을 넘지 않는다.
 * 출력: 첫 줄에 압축된 문자열을 출력한다.
 * 예시:
 *      KKHSSSSSSSE
 * 에시출력:
 *        K2HS7E
 */
public class InflearnAlgorethm_11 {
    //반복되는 숫자를 저장할 변수를 하나 만들어준다.
    //문자열을 char로 리스트화해서 for문을 돌리면서 이전 인덱스값과 비교한다.
    //만약 다음 인덱스값과 지금의 값이 같으면 아까 만들어둔 count값에 1을 더한다.
    //인덱스값과 지금의 값이 같지 않으면 지금의 문자와 count값을 추가해준 뒤 count 값을 0으로 초기화해준다.
    public String solution(String str){
        String answer="";
        str=str+' ';
        int cnt = 1;
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)== str.charAt(i+1)){
                cnt++;
            }else {
                answer+=str.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_11 T = new InflearnAlgorethm_11();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }

}
