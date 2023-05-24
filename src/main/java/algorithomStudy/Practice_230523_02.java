package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 수찾기 (백준)
// https://www.acmicpc.net/problem/2745
public class Practice_230523_02 {
    static HashMap<Character, Integer> map = new HashMap<>();


    public static int[] swap(int[] arr, int lp, int rp) {
        int temp = arr[lp];
        arr[lp] = arr[rp];
        arr[rp] = temp;

        return arr;
    }

    public int[] quicksort(int[] arr, int lp, int rp) {

        while (lp < rp) {
            int pivot = arr[lp + rp / 2];
            while (arr[rp] > pivot) rp--;
            while (arr[lp] < pivot) lp++;

            if (arr[rp] <= pivot && arr[lp] >= pivot) {
                arr = swap(arr, lp, rp);
                rp--;
                lp++;
            }

            if (lp == rp) {
                rp--;
                lp++;
            }

        }


        return arr;


    }

    public void binarySearch(int[] arr, int x) {
        int count = 0;


    }


    public ArrayList<Integer> solution(int[] arr, int n, int[] arr2, int b) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);


        for (int x : arr2) {
            int lp = 0;
            int rp = arr.length - 1;
            while (lp <= rp) {
                int mid = (lp + rp) / 2;
                if (x == arr[mid]) {
                    answer.add(1);
                    break;
                } else if (x < arr[mid]) {
                    rp = mid - 1;
                } else if (x > arr[mid]) {
                    lp = mid + 1;
                }

            }

            if(lp > rp){
                answer.add(0);
            }


        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Practice_230523_02 t = new Practice_230523_02();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }



        for (int x: t.solution(arr, n, arr2, m)) {
            System.out.println(x);
        }

    }
}
