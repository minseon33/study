import com.example.algorithm_practice.AlgorithmPracticeApplication;
import org.springframework.boot.SpringApplication;

import java.util.Scanner;


/**
 * 1. 문자찾기
 * 문제: 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요
 *      대소문자를 구분하지 않습니다. 문자열의 길이는 100을 넘지 않습니다.
 * 입력: 첫 줄에 문자열이 주어지고, 두 번째 줄에 ㅁ누자가 주어진다.
 *      문자열은 영어 알파벳으로만 구성되어 있습니다.
 */
public class Ptactice_2023_03_16_00 {
    public int solution(String str , char t){
        //1. 들어온 값들을 대문자로 다 바꿔준다.
        //2. for문을 돌면서 b가 포함되어있는지 찾아준다.
        //3, 들어있는게 있을때마다 카운트를 하나씩 올려준다.

        int count = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        System.out.println("str : " + str + " ," + " t : " + t);

//        for(int i=0; i<str.length();i++){
//            if(str.charAt(i) == t){
//                count+=1;
//            }
//        }
        //향상된 for문

        for (char x:str.toCharArray()) {
            if(x==t){
                count+=1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Ptactice_2023_03_16_00 T = new Ptactice_2023_03_16_00();
        //1. 스캐너로 첫번째 값 받아오기
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        //2. 스캐너로 두번째 값 받아오기
        char b = kb.next().charAt(0);
        //3. 함수실행
        System.out.println(T.solution(a,b));
    }
}
