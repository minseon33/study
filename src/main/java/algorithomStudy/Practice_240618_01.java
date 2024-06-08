package algorithomStudy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */
public class Practice_240618_01 {

    //내 풀이
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2+1-num1];
        int index = 0;
        for(int i = num1; i<=num2; i++){
            if(num1<=num2){
                answer[index] = numbers[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    //다른사람 풀이 따라하기

    public int[] solution2(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for(int i = num1, j = 0; i < num2+1; i++) {
            answer[j] = numbers[i];
            j++;
        }

        return answer;
    }


    public int[] solution3(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    /**
     * Arrays.copyOf() , Arrays.copyOfRange() 메소드를 통해 배열을 복사 할 수 있다.
     * Arrays.copyOf(원본배열, 복사할 길이);
     * Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
     * 값에 의한 복사이므로 복사된 배열에서 값을 바꿔도 원본 배열의 값이 바뀌지 않음
     */





    public static void main(String[] args) {
        Practice_240618_01 practice = new Practice_240618_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] numbers = {1,2,3,4,5};
        int[] numbers2 = {1,3,5};
        practice.solution(numbers, n, s);
        practice.solution2(numbers, n, s);
        practice.solution3(numbers, n, s);

    }









}
