package algorithomStudy;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 알고리즘 수업 - 선택 정렬 1
 * https://www.acmicpc.net/problem/23881
 */
public class Practice_240628_01 {


    //내 풀이
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;ß
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i=number-1; i>0; i--) {
            int idx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[idx]) idx = j;
            }

            if (idx != i) {
                int tmp = array[i];
                array[i] = array[idx];
                array[idx] = tmp;

                count++;
                if (count == k) {
                    System.out.println( array[idx]+ " " + array[i]);
                }
            }
        }

        if(count < k){
            System.out.println(-1);
        }



    }

    /**
     * 결과 :
     * 메모리 : 	39256KB
     * 시간 : 560ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {


    }


    public static void main(String[] args) throws IOException {
        Practice_240628_01 practice = new Practice_240628_01();
        practice.solution();
        practice.solution2();
    }
}
