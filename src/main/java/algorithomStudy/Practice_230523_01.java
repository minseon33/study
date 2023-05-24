package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

// 진법변환 (백준)
// https://www.acmicpc.net/problem/2745
public class Practice_230523_01 {
    static HashMap<Character,Integer> map = new HashMap<>();

    public void createMap(){
        char[] num={'0','1','2','3','4','5','6','7','8','9'};
        char[] alphabet= {'A','B','C','D','E','F','G','H','I','J','K','L',
                'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        for (int i = 0; i <10; i++) {
            map.put(num[i],i);
        }
        for (int i = 0; i < alphabet.length; i++) {
            map.put(alphabet[i],10+i);
        }
    }
    public long square(int a, int exponent){
        long sum=1;
        while (exponent>0){
            sum*=a;
            exponent--;
        }
        return sum;
    }

    public Long solution(String n, int b) {
        long answer=0;
        createMap();
        for (int i = 0; i < n.length(); i++) {
            Integer getInt = map.get(n.charAt(i));
            answer+=getInt*square(b,n.length()-1-i);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Practice_230523_01 t = new Practice_230523_01();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] arr = n.split(" ");
        System.out.println(t.solution(arr[0],Integer.parseInt(arr[1])));

    }
}
