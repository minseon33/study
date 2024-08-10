package algorithomStudy;

import java.io.*;
/**
 * 초심으로 돌아가자, 단계별 문제 도장깨기.
 * 알파벳 찾기
 * 레벨 : 브론즈2
 * https://www.acmicpc.net/problem/10809
 */
public class Practice_240810_02 {


    public static void main(String[] args) throws IOException {
        Practice_240810_02 practice = new Practice_240810_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetCharArray = alphabet.toCharArray();
        char[] sCharArray = s.toCharArray();
        int[] arr = new int[alphabetCharArray.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < alphabetCharArray.length; i++) {
            for (int j = 0; j < sCharArray.length; j++) {
                if(alphabetCharArray[i]==sCharArray[j]) {
                    arr[i] = j;
                    break;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i <arr.length ; i++) {
            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();
        }

    }

