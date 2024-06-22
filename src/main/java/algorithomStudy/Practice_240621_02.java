package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 수 정렬하기
 * https://www.acmicpc.net/problem/2750
 *
 */
public class Practice_240621_02 {

    //내 풀이


    //선택정렬 방법
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] numberArray = new int[a];

        int swapNumber = 0;
        int temp = 0;
        for (int i = 0; i < a; i++) {
            numberArray[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < numberArray.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < numberArray.length; j++) {
               if (numberArray[j]<numberArray[minIndex]){
                   minIndex = j;
               }
            }

            if(minIndex != i && numberArray[minIndex]<numberArray[i]){
                temp = numberArray[minIndex];
                numberArray[minIndex] = numberArray[i];
                numberArray[i]=temp;

            }

        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }


    }


    /**
     * 결과 :
     * 메모리 : 	14124KB
     * 시간 : 108ms
     */
    //다른사람 풀이 따라하기
    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length-1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    /**
     * 결과 :
     * 메모리 : 14108KB
     * 시간 : 104ms
     */

    public static void main(String[] args) throws IOException {
        Practice_240621_02 practice = new Practice_240621_02();
        practice.solution();
        practice.solution2();
    }
}
