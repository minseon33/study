package algorithomStudy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

// 소수 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class Practice_230417_01 {

    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < nums.length-1; i++) {
            for (int z = 1; z < nums.length-1; z++) {
                for (int j = 2; j <= nums.length-1; j++) {
                    if(i+z+j > nums.length){
                        break;
                    }
                    sum = nums[i]+nums[z]+nums[j];
                    System.out.println("nums[i]+nums[z]+nums[j] : " + nums[i]+" + " +nums[z]+" + " +nums[j] + " = " + sum);
                    sumList.add(sum);
                }
            }

        }
        System.out.println(sumList.toString());

        int[] sumArray = new int[sumList.size()];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = sumList.get(i);
        }

        //소수 구하기
        for (int i   = 2; i < sumArray.length/2; i++) {
            for (int j = 0; j < sumArray.length; j++) {
                if(sumArray[j]%i == 0){
                    sumArray[j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(sumArray));

        for (int i = 0; i < sumArray.length; i++) {
            if(sumArray[i]!=0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice_230417_01 t = new Practice_230417_01();
//        int[] a = {1,2,3,4};
        int[] b = {1,2,7,6,4};
        System.out.println(t.solution(b));
    }
}
