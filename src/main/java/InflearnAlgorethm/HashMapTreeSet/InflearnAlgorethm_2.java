package InflearnAlgorethm.HashMapTreeSet;

import java.util.HashMap;
import java.util.Scanner;


/**
 * 2. 아나그램
 */
public class InflearnAlgorethm_2 {
    public String solution(String str ,String str2) {
        //내풀이
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            // getOrDefault(x,0) -> x키를 가져오는데, 만약 키가 없다면 디폴트값 0이다...
        }
        for (char a : str2.toCharArray()){
            map2.put(a,map2.getOrDefault(a,0) + 1);
        }

        for (char a:map.keySet()) {
            if(map.get(a)!= map2.get(a)){
                answer = "NO";
                break;
            }
        }

        return answer;

    }


    public String solution2(String str ,String str2) {
        //강의풀이  오.. 공간복잡도가 더 낮아 이 풀이가..!시간복잡도도 낮고..! 오..
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            // getOrDefault(x,0) -> x키를 가져오는데, 만약 키가 없다면 디폴트값 0이다...
        }
        for (char a : str2.toCharArray()){
            if(!map.containsKey(a) || map.get(a)==0){
                return "NO";
            }
            map.put(a,map.get(a)-1);
        }


        return answer;

    }


    public static void main(String[] args) {
        InflearnAlgorethm_2 T = new InflearnAlgorethm_2();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String str2 = kb.next();
        System.out.println(T.solution2(str,str2));
    }
}
