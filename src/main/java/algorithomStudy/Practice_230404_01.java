package algorithomStudy;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Practice_230404_01 {

    //a배열과 b 배열을 비교해서 몇개 일치하는지 확인
    // 0의 개수가 몇개인지 확인
    //
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int same = 0;
        int z = 0;
        int sum = 0;
        for (int x : lottos) {
            if (x == 0) {
                z++;
            }

            for (int y : win_nums) {
                if (x == y) {
                    same++;
                }
            }
        }
        answer[0] = lottoTopRanking(same + z);
        answer[1] = lottoTopRanking(same);
        return answer;
    }

    public int lottoTopRanking(int a) {
        switch (a) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            case 1:
                return 6;
        }
        return 6;
    }

    public static void main(String[] args) {
        Practice_230404_01 t = new Practice_230404_01();
        int[] arr = {44, 1, 0, 0, 31, 25};
        int[] arr1 = {31, 10, 45, 1, 6, 19};
        System.out.println(t.solution(arr, arr1));
    }
}
