package inflearnAlgorethm.sortingAndSearching;

import java.util.Scanner;


/**
 * 2. 버블정렬
 */
public class InflearnAlgorethm_2 {

    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n-1; i++) {
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_2 T = new InflearnAlgorethm_2();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= kb.nextInt();
        }

        for (int z: T.solution(n,arr)) {
            System.out.print(z + " ");
        }
    }


}
