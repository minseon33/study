package inflearnAlgorethm.stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//6. 공주구하기
public class InflearnAlgorethm_6 {

    public int solution(int n, int k) {
        //내풀이
        int answer = 0;
        Queue<Integer> prince = new LinkedList<>();
        int a = 0;
        int num = 1;

        for (int i = 1; i < n+1; i++) {
            prince.add(i);
        }

        while (a<n-1){
            if(num!= k){
                prince.add(prince.poll());
                num++;
            }else {
                prince.remove();
                num = 1;
                a++;

            }
        }

        answer=prince.peek();


        return answer;
    }

    public int solution2(int n, int k) {
        //내풀이
        int answer = 0;
        Queue<Integer> prince = new LinkedList<>();
        int a = 0;
        int num = 1;

        for (int i = 1; i < n+1; i++) {
            prince.add(i);
        }

        while (a<n-1){
            if(num!= k){
                prince.add(prince.poll());
                num++;
            }else {
                prince.remove();
                num = 1;
                a++;

            }
        }

        answer=prince.peek();


        return answer;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_6 T = new InflearnAlgorethm_6();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        System.out.println(T.solution2(n,k));

    }

}
