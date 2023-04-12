package algorithomStudy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

// 최소직사각형
// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class Practice_230407_02 {

    public int solution(int[][] sizes) {
        int answer = 0;
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;

        for (int[] arr:sizes) {
            int arrMax = Integer.max(arr[0], arr[1]);
            int arrMin = Integer.min(arr[0], arr[1]);

            if(arrMax>width){
                width = arrMax;
            }
            if(arrMin>height){
                height=arrMin;
            }

            answer = width*height;
        }
        return answer;
    }


    public static void main(String[] args) {
        Practice_230407_02 t = new Practice_230407_02();
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(t.solution(arr));
    }
}
