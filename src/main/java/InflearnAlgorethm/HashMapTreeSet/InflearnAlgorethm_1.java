package InflearnAlgorethm.HashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


/**
 * 1. 학급회장
 */
public class InflearnAlgorethm_1 {
    public char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            // getOrDefault(x,0) -> x키를 가져오는데, 만약 키가 없다면 디폴트값 0이다...
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//            System.out.println(x + " " + map.get(x));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        InflearnAlgorethm_1 T = new InflearnAlgorethm_1();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
