package inflearnAlgorethm.sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 9. 뮤직비디오
 */
public class InflearnAlgorethm_9 {
    public int count(int[] arr,int capacity){
        int cnt = 1;//dvd 장수
        int sum = 0; //담아내는 곡의 용량

        for (int x:arr) {
            if(sum+x > capacity){
                cnt++;
                sum=x;
            }else sum+=x;

        }
        return cnt;
    }
    public int solution(int n, int m ,int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum(); //이것이 자바다에 스트림에 대해 있음. //중간메서드, 최종메서드 있으니까 알아두는것이 좋다.

        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)<=m){
                answer = mid;
                rt=mid-1;
            }else{
                lt=mid+1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        InflearnAlgorethm_9 T = new InflearnAlgorethm_9();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= kb.nextInt();
        }

        System.out.println(T.solution(n,m,arr));

    }


}
