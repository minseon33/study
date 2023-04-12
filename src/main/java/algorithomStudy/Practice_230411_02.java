package algorithomStudy;

// 콜라문제
// https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class Practice_230411_02 {

    public int solution(int a, int b, int n) {
        int answer = 0;
        int remainder = 0; //나머지
        int share = 0; // 몫
        while (n >= a) {
            remainder = n % a;
            System.out.println("remainder : " + remainder);
            share = (n/a)*b;
            System.out.println("share : " + share);
            answer+=share;
            n = share+remainder;
        }
        return answer;
    }


    public static void main(String[] args) {
        Practice_230411_02 t = new Practice_230411_02();
        int a = 3;
        int b = 2;
        int n = 10;
        System.out.println(t.solution(a, b, n));
    }
}
