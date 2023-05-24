package algorithomStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자 카드 2(백준)
// https://www.acmicpc.net/problem/10816
public class Practice_230524_01 {


    public ArrayList<Integer> solution(int[] arr, int n, int[] arr2, int b) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);

        for (int x:arr2) {
            answer.add(search(arr,0,arr.length-1,x));
        }

        return answer;
    }


    public int search(int[] arr, int start, int end, int target){
        int count = 0;

        if(start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==target) {
                count+=1;
                count+= search(arr,start,mid-1,target);
                count+= search(arr,mid+1,end,target);
            }else if(arr[mid]<target){
                count+= search(arr,mid+1,end,target);
            } else if (arr[mid]>target) {
                count+= search(arr,start,mid-1,target);
            }
        }

        return count;

    }

    public static void main(String[] args) throws IOException {
        Practice_230524_01 t = new Practice_230524_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer arrN = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrN.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        StringTokenizer arrM = new StringTokenizer(br.readLine(), " ");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(arrM.nextToken());
        }


        for (int x:t.solution(arr, n, arr2, m)) {
            bw.write(x + " ");
        }
        br.close();
        bw.close();
    }
}
