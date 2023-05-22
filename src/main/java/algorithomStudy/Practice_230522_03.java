package algorithomStudy;

// 짝수와 홀수
// https://school.programmers.co.kr/learn/courses/30/lessons/12937
public class Practice_230522_03 {


    public String solution(int a) {
        String answer=" ";
        if(a%2==0){
            return answer = "Even";
        }else {
            return answer = "Odd";
        }
    }

    public static void main(String[] args) {
        Practice_230522_03 t = new Practice_230522_03();
        int a = 3;
        System.out.println(t.solution(a));
    }
}
