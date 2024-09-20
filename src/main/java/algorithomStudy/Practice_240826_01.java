package algorithomStudy;

import java.io.IOException;


/**
 * 투포인트 알고리즘 자바 알고리즘 p.56
 * 백준 : https://www.acmicpc.net/problem/2018
 *
 */
public class Practice_240826_01 {

    public String solution(String vote) throws IOException {
        String answer = "";
        char[] charArray = vote.toCharArray();
        int aResult = 0;
        int bResult = 0;
        int cResult = 0;
        for (char ch :charArray) {
            if(ch == 'A')aResult++;
            if(ch == 'B')bResult++;
            if(ch == 'C')cResult++;
        }

        if(cResult>charArray.length/2){
            answer = "C";
        } else if (aResult==bResult) {
            answer = "AB";
        } else if (aResult>bResult) {
            answer = "A";
        } else if (bResult>aResult) {
            answer = "B";

        }

        return answer;
    }




    public static void main(String[] args) throws IOException {
        Practice_240826_01 practice = new Practice_240826_01();
        String a = "ABBCCCBBAB";
        System.out.println(practice.solution(a));
    }
}


