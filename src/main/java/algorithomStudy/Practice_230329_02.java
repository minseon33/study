package algorithomStudy;

import java.util.Arrays;
import java.util.Scanner;

// 모스부호 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/120838
public class Practice_230329_02 {
    public String solution(String letter) {
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz ";
        String answer = "";

        String letter2 = letter.toLowerCase();


        for (char x:letter2.toCharArray()) {
            int i = alphabet.indexOf(String.valueOf(x));
            System.out.println("i :" + i);
            answer+=array[i];
            answer+=" ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Practice_230329_02 t = new Practice_230329_02();
        String letter = "hello";
        String letter2 = "python";
        System.out.println(t.solution(letter));
        System.out.println(t.solution(letter));
    }


}
