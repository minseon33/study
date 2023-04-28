package InflearnAlgorethm.HashMapTreeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


/**
 * 3. 매출액의 종류
 */
public class InflearnAlgorethm_3 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        //내풀이
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (rt - lt < k - 1) {
                map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            }

            if (rt - lt == k - 1) {
                map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
                answer.add(map.size());
                if (map.get(arr[lt]) > 1) {
                    map.put(arr[lt], map.getOrDefault(arr[lt], 0) - 1);
                } else if (map.get(arr[lt]) == 1) {
                    map.remove(arr[lt]);
                }
                lt++;


            }
        }

        int[] result = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return answer;

    }


    public ArrayList<Integer> solution2(int n, int k, int[] arr) {
        //강사님 풀이
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return answer;

    }


    public static void main(String[] args) {
        InflearnAlgorethm_3 T = new InflearnAlgorethm_3();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        System.out.println(T.solution2(n, k, a));
    }
}
