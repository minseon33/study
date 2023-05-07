package InflearnAlgorethm.StackQueue;

import java.util.*;

//8. 응급실


class Person{
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class InflearnAlgorethm_8 {

    public int solution(int n, int k, int[] arr) {
        //내풀이
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            q.add(new Person(i,arr[i]));
        }
        while (!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if (x.priority>tmp.priority){
                    q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==k) return answer;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        InflearnAlgorethm_8 T = new InflearnAlgorethm_8();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=kb.nextInt();
        }

        System.out.println(T.solution(n,k,arr));

    }

}
