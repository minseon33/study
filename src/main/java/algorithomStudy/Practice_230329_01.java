package algorithomStudy;

import java.util.Arrays;

// 이진 변환 반복하기
// https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class Practice_230329_01 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int count = 0;
        while (s.length()>1){
            //0카운트 추가
            zero += count(s);
            //0제거
            s = s.replace("0","");
            // 2진수 문자열로 변환
            s = Integer.toBinaryString(s.length());
            count++;
        }
        answer[0] = count;
        answer[1] = zero;

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int count(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x == '0') {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice_230329_01 t = new Practice_230329_01();
        String letter = "110010101001";
        System.out.println(t.solution(letter));
    }


}
