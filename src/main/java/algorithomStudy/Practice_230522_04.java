package algorithomStudy;

// 평균 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class Practice_230522_04 {


    public double solution(int[] arr) {
        double max = 0;
        for (int x:arr) {
            max+=x;
        }
        return max/arr.length;
    }

    public static void main(String[] args) {
        Practice_230522_04 t = new Practice_230522_04();
        int[] a = {1, 2, 3, 4};
        System.out.println(t.solution(a));
    }
}
