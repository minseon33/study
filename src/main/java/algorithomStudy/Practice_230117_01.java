package algorithomStudy;

import java.util.Arrays;

//푸드파이터 대회
//https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class Practice_230117_01 {

    public String solution(int[] food) {
        String answer = "";
        int[] foodList = new int[food.length];
        for (int i = 1; i < food.length; i++) {
            foodList[i] = food[i]/2;
        }
        System.out.println(Arrays.toString(foodList));
        for (int i = 0; i < foodList.length; i++) {
            while (foodList[i]>0){
                answer += i;
                foodList[i]--;
            }
        }

        answer+='0';
        char[] charArray = answer.toCharArray();

        for (int i = charArray.length-1; i > 0 ; i--) {
            answer+=charArray[i-1];
        }


        return answer;
    }

    public static void main(String[] args) {
        Practice_230117_01 t = new Practice_230117_01();

        int[] food = {1, 3, 4, 6};
        int[] food2 = {1, 7, 1, 2};

        System.out.println(t.solution(food));

    }
}
