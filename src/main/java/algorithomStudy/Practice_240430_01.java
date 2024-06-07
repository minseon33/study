package algorithomStudy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * 문자열 정렬하기 (2)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */
public class Practice_240430_01 {

    //선택정렬 버전
    public static String solution(String my_string) {
        Map<Character,Integer> alphabetSequence = new HashMap<>();
        Character[] alphabetList = {'a','b','c','d','e','f','g', 'h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u', 'v','w','x','y','z'};
        String answer = "";

        for (int i = 0; i < alphabetList.length; i++) {
            alphabetSequence.put(alphabetList[i],i);
        }
        String lowerCase = my_string.toLowerCase(Locale.ROOT);

        char[] charArray = lowerCase.toCharArray();
        int[] index = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            Integer integer = alphabetSequence.get(charArray[i]);
            index[i] = integer;
        }

        //index 안에 alphabetList의 인덱스번호들이 들어있다. -> 이것을 정렬해서 만들어야 함
        //정렬 방법 : 선택정렬, 버블정렬, 퀵정렬 다 사용해보기
        //선택정렬
        for (int i = 0; i < index.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < index.length; j++) {
                if(index[i] > index[j]){
                    minIndex = j;

                    int temp = index[minIndex];
                    index[minIndex] = index[i];
                    index[i] = temp;
                }
            }
        }
        //정렬된 인덱스로 문자열 뽑기
        for (int i:index) {
            answer+=alphabetList[i];
        }

        return answer;
    }


    //버블정렬 버전
    public static String solution2(String my_string) {
        Map<Character,Integer> alphabetSequence = new HashMap<>();
        Character[] alphabetList = {'a','b','c','d','e','f','g', 'h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u', 'v','w','x','y','z'};
        String answer = "";

        for (int i = 0; i < alphabetList.length; i++) {
            alphabetSequence.put(alphabetList[i],i);
        }
        String lowerCase = my_string.toLowerCase(Locale.ROOT);

        char[] charArray = lowerCase.toCharArray();
        int[] index = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            Integer integer = alphabetSequence.get(charArray[i]);
            index[i] = integer;
        }

        //index 안에 alphabetList의 인덱스번호들이 들어있다. -> 이것을 정렬해서 만들어야 함
        //정렬 방법 : 버블정렬, 퀵정렬 다 사용해보기
        //선택정렬
        for (int i = 0; i < index.length; i++) {

        }
        //정렬된 인덱스로 문자열 뽑기
        for (int i:index) {
            answer+=alphabetList[i];
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        String s = "Bcad";
        String s1 = "heLLo";
        String s2 = "Python";
        //선택정렬 버전
        System.out.println(solution(s));
        System.out.println(solution(s1));
        System.out.println(solution(s2));

        //버블정렬 버전
        System.out.println(solution2(s));
        System.out.println(solution2(s1));
        System.out.println(solution2(s2));


    }

}
