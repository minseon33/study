package algorithomStudy;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Practice_230405_03 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Practice_230405_03 t = new Practice_230405_03();
        int[][] num = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        System.out.println(t.solution(num, arr2));
    }
}
