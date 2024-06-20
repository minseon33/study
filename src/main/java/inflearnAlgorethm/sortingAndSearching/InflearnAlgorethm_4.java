package inflearnAlgorethm.sortingAndSearching;

import java.util.Scanner;


/**
 * 4. LRU(캐시, 카카오 변형)
 */
public class InflearnAlgorethm_4 {

    public int[] solution(int size, int n, int[] arr) {

        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
             if (x==cache[i]){
                 pos=i;
             }
            }
            if(pos == -1){
                for(int i = size-1; i>=1; i--){
                    cache[i]=cache[i-1];
                }
                cache[0]=x;
            }else {
                for(int i = pos; i>=1; i--){
                    cache[i]=cache[i-1];
                }
                cache[0]=x;
            }
        }
        return cache;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_4 T = new InflearnAlgorethm_4();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= kb.nextInt();
        }

        for (int z: T.solution(s,n,arr)) {
            System.out.print(z + " ");
        }
    }


}
