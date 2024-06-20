package InflearnAlgorethm.Array;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 14. 가위바위보
 * 문제: A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 *      가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 *      예를 들어 N=5이면
 *      ----------------
 *      회수 : 1 2 3 4 5
 *  A의 정보 : 2 3 3 1 3
 *  B의 정보 : 1 1 2 2 3
 *      승자 : A B A B D
 *      ----------------
 *      두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 * 입력: 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 *      두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *      세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 출력: 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 * 예시:
 *      5
 *      2 3 3 1 3
 *      1 1 2 2 3
 * 에시출력:
 *        A
 *        B
 *        A
 *        B
 *        D
 */
public class InflearnAlgorethm_2 {
    public ArrayList<String> solution(int n, int[] arr,int[] arr2){
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] == 1 && arr2[i]==3 || arr[i] == 2 && arr2[i]== 1 || arr[i] == 3 && arr2[i]==2 ){
               answer.add("A");
            }else if (arr[i]==arr2[i]) {
                answer.add("D");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_2 T = new InflearnAlgorethm_2();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int i = 0; i<n; i++){
                   arr2[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr,arr2));


    }

}
