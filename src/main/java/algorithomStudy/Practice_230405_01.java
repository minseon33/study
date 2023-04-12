package algorithomStudy;

import java.util.*;

// 문자열 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Practice_230405_01 {

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int counter = 0;
        int max = Integer.MIN_VALUE;
        Arrays.sort(tangerine);
        int[] duplicate = new int[tangerine.length]; //중복값 배열
        int[] maxDuplicate = new int[duplicate.length];//최대 중복값 배열
        int index = 0;

        for (int i = 0; i < duplicate.length; i++) {
            duplicate[tangerine[i]]++;
        }
        System.out.println("중복값 : " + Arrays.toString(duplicate));

        //중복값이 가장 여러개 나온걸로 나눠준다.
        for (int i = 0; i < duplicate.length; i++) {
            if (duplicate[i] != 0) {
                maxDuplicate[duplicate[i]]++;
            }
        }

        //최대값 구하기
        for (int x : maxDuplicate) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("맥스값 : " + max + " 인덱스 값 : " + Arrays.asList(maxDuplicate).indexOf(max));

        //최대값의 인덱스 번호로 나누기.
        for (int i = 0; i < maxDuplicate.length; i++) {
            if (maxDuplicate[i] == max) {
                index = i;
                break;
            }
        }
        System.out.println("인덱스 : " + index);
        answer = k / index;
        System.out.println("중복값2 : " + Arrays.toString(maxDuplicate));
        return answer;

    }

    public int solution2(int k, int[] tangerine) {
        int answer = 0;
        int[] duplicate = new int[tangerine.length]; //중복값 배열
        HashMap<Integer,Integer> map = new HashMap();
        ArrayList<Integer> mapList = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        // tangerine 을 큰수부터 정렬한다.
        // 중복된 값이 큰 수부터 정렬한다.
        // 정렬한것을 힙에 넣어준다.
        // 큰 수부터 n개를 빼는데 이전에 뺀것과 숫자가 다르면 카운트를 하나 올려준다.

        Arrays.sort(tangerine);
        System.out.println("정렬 : " + Arrays.toString(tangerine));

        //중복값이 몇개 나왔는지 계산한다.
        for (int i = 0; i < duplicate.length; i++) {
                duplicate[tangerine[i]]++;
        }
        System.out.println("중복값 배열 : " + Arrays.toString(duplicate));

        //중복값이 나온 개수와 인덱스 값을 map에 저장한다.
        for (int i = 0; i < duplicate.length; i++) {
            map.put(i,duplicate[i]);
        }

        //맵의 밸류값이 큰 순서대로 정렬한다.
        // 맵을 List 형태로 저장한다.
        List<Map.Entry<Integer, Integer>> valueList = new LinkedList<>(map.entrySet());
        valueList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("정렬된 밸류 리스트 : " + valueList.toString());
        //맵으로 정렬한 값을 밸류값만큼 어레이리스트에 저장한다.
        for (int i = 0; i < valueList.size(); i++) {
            for (int j = 0; j < valueList.get(i).getValue(); j++) {
                mapList.add(valueList.get(i).getKey());
            }
        }

        System.out.println("맵리스트 값 : "+ mapList.toString());

        //어레이리스트 값을 n+1개 만큼 리스트에 넣어주는데 넣어주고, 이전 인덱스와 비교해서 번호가 바뀔때마다 answer 값을 ++ 해준다.
        arrayList.add(0); //어레이 리스트에 처음값 0을 하나 넣어준다.
        for (int i = 0; i < k-1; i++) {
            if(arrayList.get(i) != mapList.get(i)){
                answer++;
            }
            arrayList.add(mapList.get(i));
        }
        return answer;
    }
    public int solution3(int k, int[] tangerine) {
        int answer = 0;


        return answer;
    }


    public static void main(String[] args) {
        Practice_230405_01 t = new Practice_230405_01();
        int num1 = 6;
        int[] arr1 = {1, 3, 2, 5, 4, 5, 2, 3};
        int num2 = 4;
           int[] arr2 = {1, 3, 2, 5, 4, 5, 2, 3};
        int num3 = 2;
           int[] arr3 = {1, 1, 1, 1, 2, 2, 2, 3};
//        System.out.println(t.solution(num, arr2));
        System.out.println(t.solution3(num1, arr1));
        System.out.println(t.solution3(num2, arr2));
        System.out.println(t.solution3(num3, arr3));
    }
}
