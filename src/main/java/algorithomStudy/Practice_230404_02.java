package algorithomStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Practice_230404_02 {

    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0 ; i--) {
            answer += chars[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice_230404_02 t = new Practice_230404_02();
        String arr = "Zbcdefg";
        int[] arr2 = {10};
        System.out.println(t.solution(arr));
    }
}
