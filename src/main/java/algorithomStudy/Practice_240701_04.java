package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * ATM
 * https://www.acmicpc.net/problem/11399
 */
public class Practice_240701_04 {


    //내 풀이
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int time = 0;
        int sum = 0;

        Collections.sort(list); //오름차순 정렬
//        Collections.sort(list,Collections.reverseOrder()); // 내림차순 정렬

        for (int x:list) {
            time+=x;
            sum+=time;
        }

        System.out.println(sum);

    }


    /**
     * 결과 :
     * 메모리 : 14384KB
     * 시간 : 112ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {


    }

    /**
     * 결과 :
     * 메모리 : 129608KB
     * 시간 : 800ms
     */
    public static void main(String[] args) throws IOException {
        Practice_240701_04 practice = new Practice_240701_04();
        practice.solution();
        practice.solution2();

    }
}
