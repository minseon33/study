package algorithomStudy;
import java.io.IOException;
import java.util.Scanner;

/**
 * 직각삼각형 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */
public class Practice_240608_01 {

    //내 풀이
    public static void solution(int n){
        String s = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j< n;j++){
                s+="*";
                if (i == j) {
                    s+='\n';
                    break;
                }
            }
        }
        System.out.println(s);
    }


    //다른사람 풀이 따라하기
    public static void solution2(int n){

        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
    }

    /**
     * "String.repeat()"
     * String 메서드 중 하나로 String 문자열을 파라미터의 주어진 횟수만큼 반복
     * java11에서 새로 추가된 String 메서드이다.
     * -----------------------------------------------------------------
     * 파라미터를 0으로 지정하면, 빈 문자열을 반환
     * 파라미터를 음수로 지정하면, IllegalArgumentExceptionthrow 에러를 반환
     * 파라미터를 1로 지정하면 문자열을 그대로 반환합니다
     *--------------------------------------------------------------------
     * 이 메서드는 내부적으로 Arrays.fill()및 System.arraycopy()메서드를 호출 하여 새 문자열을 만든다.
     *
     */



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
        solution2(n);
    }









}
