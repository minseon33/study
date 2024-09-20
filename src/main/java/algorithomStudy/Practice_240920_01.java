package algorithomStudy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * 소수
 * 백준 : https://www.acmicpc.net/problem/2581
 * todo -> 백준 소수문제 못풂, 시간날때 재도전 (24.9.20)
 *
 */
public class Practice_240920_01 {

    public void solution(int n, int m) throws IOException {
        List<Integer> array = new ArrayList<>();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        //배열 초기화
        for (int i = n; i <= m ; i++) {
            array.add(i);
        }

        for (int i = 2; i <array.size() ; i++) {
            for (int j = 0; j < array.size(); j++) {
                if(array.get(j) % i == 0){
                    array.set(j,0);
                }
            }
        }

        for (int num:array) {
            if(num != 0){
                sum += num;
                if(min>num){
                    min = num;
                }
            }
        }
        System.out.println(array.toString());

        if(sum==0){
            System.out.println(-1);
        }else {

            System.out.println(sum);
            System.out.println(min);
        }






    }




    public static void main(String[] args) throws IOException {
        Practice_240920_01 practice = new Practice_240920_01();
        practice.solution(64,65);
    }
}


