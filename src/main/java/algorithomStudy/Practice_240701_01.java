package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 선택정렬, 버블정렬, 삽입정렬 연습
 */
public class Practice_240701_01 {


    //내 풀이

    //선택정렬
    public void solution1() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int n = 5;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("선택정렬 초기 arr : " +Arrays.toString(arr));

        for (int i = 0; i < n-1; i++) {
            int idx = i;  //최소값을 가진 인덱스를 저장;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[idx]){
                   idx = j;
                }
            }
            // 두번째 for 문이 모두 끝나야 최소값을 알 수 있다.
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx]=tmp;
            System.out.println(i+"번째 : " +Arrays.toString(arr));
        }
    }


    //버블정렬
    public void solution2() throws IOException , ArrayIndexOutOfBoundsException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int n = 5;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("버블정렬 초기 arr : " +Arrays.toString(arr));

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = tmp;
                }
            }

            System.out.println(i+"번째 : " +Arrays.toString(arr));

        }



    }
    //삽입정렬
    public void solution3() throws IOException , ArrayIndexOutOfBoundsException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int n = 5;
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("삽입정렬 초기 arr : " +Arrays.toString(arr));

        for (int i = 1; i <n ; i++) {
            int tmp = arr[i],j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=tmp;
            System.out.println(i+"번째 : " +Arrays.toString(arr));

        }

    }


    public static void main(String[] args) throws IOException {
        Practice_240701_01 practice = new Practice_240701_01();
        practice.solution1();
        practice.solution2();
        practice.solution3();
    }
}
