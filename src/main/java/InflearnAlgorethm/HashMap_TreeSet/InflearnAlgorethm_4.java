package InflearnAlgorethm.HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;


/**
 * 3. 모든 아나그램 찾기
 */
public class InflearnAlgorethm_4 {
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x :b.toCharArray()) {
            bm.put(x,bm.getOrDefault(x,0)+1);
        }
        int l = b.length()-1;

        for (int i = 0; i < l; i++) {
            am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1);
        }
        int lt=0;
        for(int rt=l; rt<a.length(); rt++){
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)){
                answer++;
            }
            am.put(a.charAt(lt),am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0){
                am.remove(a.charAt(lt));
            }
            lt++;
        }

        return answer;

    }




    public static void main(String[] args) {
        InflearnAlgorethm_4 T = new InflearnAlgorethm_4();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String k = kb.next();
        System.out.println(T.solution(n, k));

    }
}
