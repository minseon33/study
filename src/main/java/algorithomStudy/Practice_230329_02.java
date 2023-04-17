package algorithomStudy;


import java.util.HashMap;

// 모스부호 (1)
// https://school.programmers.co.kr/learn/courses/30/lessons/120838
public class Practice_230329_02 {
    public String solution(String letter) {
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String answer = "";

        char[] charArray = alphabet.toCharArray();
        String[] s = letter.split(" ");

        HashMap map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],charArray[i]);
        }

        for (String x: s) {
            answer+=map.get(x);
        }


        return answer;
    }

    public static void main(String[] args) {
        Practice_230329_02 t = new Practice_230329_02();
        String letter = ".... . .-.. .-.. ---";
        String letter2 = "python";
        System.out.println(t.solution(letter));
    }


}
