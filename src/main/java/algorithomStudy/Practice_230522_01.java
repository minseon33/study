package algorithomStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 최빈값 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120812
public class Practice_230522_01 {

    public int solution(int[] arr) {
        int answer=-1;
        int max= 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x:arr) {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for (int key:map.keySet()) {
            if (map.get(key)==max){
                answer=-1;
                max=map.get(key);
            } else if (map.get(key)>max) {
                answer=key;
                max=map.get(key);

            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Practice_230522_01 t = new Practice_230522_01();
//        int[] a = {1,2,3,4};
        int[] b = {1, 2, 3, 3, 3, 4};
        System.out.println(t.solution(b));
    }
}
