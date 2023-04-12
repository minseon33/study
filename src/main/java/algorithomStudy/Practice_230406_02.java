package algorithomStudy;

import java.util.*;

// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Practice_230406_02 {

    public int solution(int[] array, int n) {
        int answer = 0;
        int cnt = Integer.MAX_VALUE;
        int num = 0;
        Integer[] b = Arrays.stream(array).boxed().toArray(Integer[]::new);
        HashMap<Integer,Integer> map = new HashMap<>();

        Arrays.sort(b,Collections.reverseOrder());
        System.out.println(Arrays.toString(b));

        for (int x : b) {
            if (Math.abs(n - x) == cnt) {
                map.put(x,cnt);
                map.put(x,cnt);
            } else if (Math.abs(n - x) < cnt) {
                cnt = Math.abs(n - x);
                map.put(x,cnt);
            }
        }

        for(Integer key :map.keySet()){
            if(Math.abs(map.get(key))==cnt){
                return answer = key;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Practice_230406_02 t = new Practice_230406_02();
        int num = 20;
        int[] arr = {5, -22, 4, 3, 7, 15, 22, 24};
        System.out.println(t.solution(arr, num));
    }
}
