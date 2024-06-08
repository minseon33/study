package algorithomStudy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 숨어있는 숫자의 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
public class Practice_240607_01 {


    public static int solution(String my_string) {
        int answer = 0;
        String[] stringSplit = my_string.split("");
        String numbers ="1234567890";

        for(String s :stringSplit){
            if(numbers.contains(s)){
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }


    //다른사람 풀이 따라하기

    public static int solution1(String my_string){
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");

        for(char ch : str.toCharArray()){
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }



    public static void main(String[] args) throws IOException {
        String s = "aAb1B2cC34oOp";
        String s1 = "1a2b3c4d123";
        String s2 = "asdf1sw2fdwc3sqfa4fqwrf5";

        System.out.println(solution(s));
        System.out.println(solution(s1));
        System.out.println(solution(s2));

        System.out.println("============= 다른사람 풀이 =============");

        System.out.println(solution1(s));
        System.out.println(solution1(s1));
        System.out.println(solution1(s2));

    }

}
