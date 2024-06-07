package algorithomStudy;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * N개의 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12953
 */
public class Practice_240301_02 {

    public int solution(int[] arr) {
        // arr = [2,6,8,14]
        boolean isValid = true;
        int answer = 1;
        List<Integer> number = new ArrayList<>();
        int number2=1;
        for (int i = 0; i < arr.length; i++) {
            if (solution2(arr, 2)) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = arr[j] / 2;
                }
                number.add(2);
                isValid = true;
                // arr = 1,3,4,7

            } else if (solution2(arr, 3)) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = arr[j] / 3;
                }
                isValid = true;
            } else if(solution2(arr, 5)){
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = arr[j] / 5;
                }
                isValid = true;

            }else {
                isValid = false;
                break;
            }
        }

        if(isValid == false){
            for (int s : arr) {
                answer *= s;
            }
            for (int s : number){
                number2 *= s;
            }
        }

        return answer*number2;
    }

    public boolean solution2(int[] arr, int n) {
        boolean isValid = false;
        for (int s : arr) {
            //arr = [2,6,8,14]
            if (s % n == 0) {
                isValid = true;
            } else {
                return false;
            }
        }
        return isValid;
    }

    public static void main(String[] args) throws IOException {

        int[] arr = {2,6,8,14};
        int solution = solution(arr);

        System.out.println(solution);

    }
}
