package algorithomStudy;
import java.io.IOException;
import java.util.Scanner;

/**
 * 직각삼각형 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */
public class Practice_240608_01 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = "";
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j< n;j++){
                s+="*";
                if (i == j) {
                    s+='\n';
                    break;
                }
            }
        }
        System.out.println(s);
    }

}
