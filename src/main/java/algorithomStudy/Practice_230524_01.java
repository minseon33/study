package algorithomStudy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 숫자 카드 2(백준)
// https://www.acmicpc.net/problem/10816
public class Practice_230524_01 {


    public ArrayList<Integer> solution(int[] arr, int n, int[] arr2, int b) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        for (int x:arr2) {
            answer.add(search2(arr,0,arr.length-1,x));
        }

        return answer;
    }

    public int search(int[] arr, int start, int end, int target){
        int count = 0;
        int mid = arr[(start+end)/2];
        if(start<=end){
            if(arr[start] == target){
                count++;
                count+=search(arr,start+1,end,target);
            } else if (arr[end] == target) {
                count++;
                count+=search(arr,start,end-1,target);
            } else if(mid==target){
                count++;
            } else if (mid<target) {
                count+=search(arr,start+1,end,target);
            }else {
                count+=search(arr,start,end-1,target);
            }
        }

        return count;

    }

    public int search2(int[] arr, int start, int end, int target){
        int count = 0;



        while (start<=end){
            int mid = (start+end)/2;

            if (arr[mid]==target) {
                count++;
            }else if(arr[mid]<target){
                start=mid+1;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
        }

        return count;

    }

    public static void main(String[] args) throws IOException {
        Practice_230524_01 t = new Practice_230524_01();
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

        for (int x:t.solution(arr, n, arr2, m)) {
            System.out.print(x + " ");
        }
    }
}
