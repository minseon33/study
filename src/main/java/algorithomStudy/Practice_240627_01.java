package algorithomStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 소수의 연속합
 * https://www.acmicpc.net/problem/1644
 */
public class Practice_240627_01 {


    //내 풀이
    public int[] createPrimeList(int number, int[] primeNumberArray) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i <= number; i++) {
            primeNumberArray[i] = i;
        }
        //에라토스테네스체
        primeNumberArray[1] = 0;  // 1은 소수가 아니다.
        for (int i = 2; i < number/2; i++) {
            for (int j = i+i; j < number + 1; j+=i) {
                primeNumberArray[j] = 0;
            }
        }
        return primeNumberArray;
    }

    public void solution() throws IOException , ArrayIndexOutOfBoundsException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int count = 0;
        if(number!=0) {
            int[] primeNumberArray = new int[number + 1];
            primeNumberArray = createPrimeList(number, primeNumberArray);
            ArrayList<Integer> primeList = new ArrayList<>();
            for (int s : primeNumberArray) {
                if (s != 0) {
                    primeList.add(s);
                }
            }

            for (int i = 0; i <= primeList.size() - 1; i++) {
                int result = primeList.get(i);
                if (result == number) count++;
                for (int j = i + 1; j < primeList.size(); j++) {
                    result += primeList.get(j);
                    if (result == number) {
                        count++;
                        break;
                    } else if (result > number) {
                        break;
                    }
                }
            }
        }
        System.out.println(count);


    }

    /**
     * 결과 :
     * 메모리 : 	39256KB
     * 시간 : 560ms
     */


    //다른 사람 풀이

    public void solution2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);

        if (N < 2) {
            bw.write("0");
            bw.flush();
            bw.close();
            return;
        }

        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int sub = 0;
        int start = 2;
        int end = 2;
        int answer = 0;

        while (end <= N) {
            if (!isPrime[end]) {
                end++;
                continue;
            }
            sub += end;

            while (sub > N && start <= end) {
                if (isPrime[start]) {
                    sub -= start;
                }
                start++;
            }

            if (sub == N) {
                answer++;
            }
            end++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }


    public static void main(String[] args) throws IOException {
        Practice_240627_01 practice = new Practice_240627_01();
        practice.solution();
        practice.solution2();
    }
}
