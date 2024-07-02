package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 단어 정렬
 * https://www.acmicpc.net/problem/1181
 */
public class Practice_240702_01 {


    //내 풀이
    //Stream 연습
    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }

        List<String> collect = list.stream().sorted(Comparator.comparingInt(String::length)).distinct().collect(Collectors.toList());

        for (String s:collect) {
            System.out.println(s);
        }

    }


    /**
     * 결과 :
     * 메모리 : 26616KB
     * 시간 : 528ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }

        });

        sb.append(arr[0]).append("\n");

        for (int i = 1; i < N; i++) {
            if (!arr[i - 1].equals(arr[i])) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb.toString());

    }

    /**
     * 결과 :
     * 메모리 : 25844KB
     * 시간 : 336ms
     */
    public static void main(String[] args) throws IOException {
        Practice_240702_01 practice = new Practice_240702_01();
        practice.solution();
//        practice.solution2();

    }
}
