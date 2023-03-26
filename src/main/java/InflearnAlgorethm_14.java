import java.util.ArrayList;
import java.util.Scanner;


/**
 * 12. 보이는 학생
 * 문제: 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 *      선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 * 입력: 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 * 출력: 선생님이 볼 수 있는 최대학생수를 출력한다.
 * 예시:
 *      8
 *      130 135 148 140 145 150 150 153
 * 에시출력:
 *        5
 */
public class InflearnAlgorethm_14 {
    public Integer solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 1;
        int max = arr[0];
        answer.add(arr[0]);
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                count++;
                max = arr[i];
            }
        }

        return count;
    }



    public static void main(String[] args) {
        InflearnAlgorethm_14 T = new InflearnAlgorethm_14();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,arr));


    }

}
