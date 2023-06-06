package algorithomStudy;

import java.io.IOException;
import java.util.*;


/**
 * 좌표압축
 * https://www.acmicpc.net/problem/18870
 */
public class Practice_230606_01 {


    public ArrayList<Integer> solution(int n, Integer[] arr) {
        int count = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        Set<Integer> sortArr2 = new HashSet<>(Arrays.asList(arr.clone()));
        Integer[] sortArr = sortArr2.toArray(new Integer[0]);

        Arrays.sort(sortArr);

        for (int x:arr) {
            count=0;
            for (int a:sortArr) {
                if(x==a){
                    answer.add(count);
                    break;
                }else if(a<x){
                    count++;
                }
            }
        }

        System.out.println("answer : " + answer.toString());

        return answer;
    }


    public ArrayList<Integer> solution2(int n, Integer[] arr) {
        int count = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        Integer[] sortArr = arr.clone();
        HashMap<Integer,Integer> map = new HashMap<>();

        Arrays.sort(sortArr);

        for (int i = 0; i < sortArr.length; i++) {
            if(!map.containsKey(sortArr[i])){
                map.put(sortArr[i],count);
                count++;
            }
        }


        for (Integer x:arr) {
            answer.add(map.get(x));
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Practice_230606_01 t = new Practice_230606_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x: t.solution2(n,arr)) {
            System.out.print(x + " ");
        }


    }
}
