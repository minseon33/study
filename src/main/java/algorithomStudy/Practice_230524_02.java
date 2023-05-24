package algorithomStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 나머지
// https://www.acmicpc.net/problem/10430
public class Practice_230524_02 {


    public void solution(int[] arr, int n, int[] arr2, int b) {

    }

    public static void main(String[] args) throws IOException {
        Practice_230524_02 t = new Practice_230524_02();
        Scanner kb = new Scanner(System.in);
        int A = kb.nextInt();
        int B = kb.nextInt();
        int C = kb.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
