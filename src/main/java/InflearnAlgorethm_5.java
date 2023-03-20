import java.util.ArrayList;
import java.util.Scanner;


/**
 * 5. 단어 뒤집기
 * 문제: 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *      특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 입력: 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력: 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 * 예시:
 *      a#b!fw!d@s
 * 에시출력:
 *          s#d!wf!b@a
 */
public class InflearnAlgorethm_5 {
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
        InflearnAlgorethm_5 T = new InflearnAlgorethm_5();
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
