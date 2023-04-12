package algorithomStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Practice_230411_01 {
    //배열을 오름차순으로 정렬하고
    //for문을 돌려서 reserve에 있는 첫번째 값에서 +1을 더한 값이 lost에 포함되어있으면
    //count를 하나 올려준다.
    // lost의 길이랑 count를 뺀 값을 전체 배열의 길이에서 빼주면 체육복을 입은 학생으 값이 나올듯..!

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int x:lost) {
            arrayList.add(x);
        }

        int count = 0;
        for (int i = 0; i < reserve.length; i++) {
            if(arrayList.containsAll(Collections.singleton((reserve[i])))){
                count++;
            } else if (arrayList.containsAll(Collections.singleton((reserve[i])+1))) {
                count++;
            }
            System.out.println("count : "+ count);
        }


        answer = n- (lost.length - count);
         return answer;
     }


    public static void main(String[] args) {
        Practice_230411_01 t = new Practice_230411_01();
        int a = 5;
        int[] b = {1,2,3};
        int[] n = {2,3,4};
        System.out.println(t.solution(a, b, n));
    }
}
