package algorithomStudy;

import java.util.ArrayList;

// 2016년
// https://school.programmers.co.kr/learn/courses/30/lessons/12901
public class Practice_230412_01 {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU" };
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = 0;

        for (int i = 0; i < a-1; i++) {
            System.out.println("month "+(i+1)+"월 : " + month[i] );
            day+=month[i];

        }
        day+=b;
        int i = day % 7;
        if(i==0 || i==6){
            answer=week[6];
        }else {
            answer=week[i-1];
        }
        return answer;
    }

    public String solution2(int a, int b) {
            String answer = "";
            String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU" };
            int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
            int day = 0;

            for (int i = 0; i < a-1; i++) {
                System.out.println("month "+(i+1)+"월 : " + month[i] );
                day+=month[i];

            }
            day+=b;
            int i = day % 7;
            if(i==0){
                answer=week[6];
            }else {
                answer=week[i-1];
            }
            return answer;
        }

    public static void main(String[] args) {
        Practice_230412_01 t = new Practice_230412_01();
        int a = 1;
        int b = 6;
        System.out.println(t.solution(a, b));
    }
}
