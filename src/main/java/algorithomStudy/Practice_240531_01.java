package algorithomStudy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 문자열을 정수로 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */
public class Practice_240531_01 {


    public static int solution(String my_string) {
        Map<String,Integer> numberSequence = new HashMap<>();
        String number = "0123456789";
        String[] split1 = number.split("");
        for(int i = 0; i<split1.length; i++){
            numberSequence.put(split1[i],i);
        }
        int answer=0;
        String[] split = my_string.split("");

        if(split[0].equals("-")){

            for(int i=1; i<split.length;i++){
                Integer integer = numberSequence.get(split[i]) * (int) Math.pow(10, split.length-i - 1);
                answer+=integer;
            }
            return answer * -1;

        }else if(split[0].equals("+")){
            for(int i=1; i<split.length;i++){
                Integer integer = numberSequence.get(split[i]) * (int) Math.pow(10, split.length-i - 1);
                answer+=integer;
            }
            return answer;

        }else {
            for(int i=0; i<split.length;i++){
                Integer integer = numberSequence.get(split[i]) * (int) Math.pow(10, split.length-1-i);
                answer+=integer;
            }

        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        String s = "-1234";
        String s1 = "+1234";
        String s2 = "1234";

        System.out.println(solution(s));
        System.out.println(solution(s1));
        System.out.println(solution(s2));

        System.out.println(solution(s));
        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }

}
