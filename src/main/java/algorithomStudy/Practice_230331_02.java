package algorithomStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 제일 작은 수 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class Practice_230331_02 {

    // for문 돌려서 나온 x 값을 minNum 변수에 저장하고 어레이 리스트에 저장
    // 해시맵에 minNum 값을 키로, 인덱스 값을 밸류로 저장한다.
    // 최소값 minNum 을 키로 이용해 최소값의 인덱스번호를 찾아내서 삭제해준다.
    // 만약 어레이리스트의 길이가 0이라면 -1을 넣어준다.
    public List<Integer> solution(int[] arr) {

        int minNum = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();


        //for문 돌려서 나온 값을 minNum 변수에 저장하고 어레이 리스트에 저장
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            //만약 x값이 minNum보다 작으면 최소값 갱신해준다.
            if (arr[i] < minNum) {
                minNum = arr[i];
                map.put(minNum, i);
            }
        }

        Integer index = map.get(minNum);
        list.remove((int)index);

        if(list.size()==0){
            list.add(-1);
        }

        return list;
    }

    public static void main(String[] args) {
        Practice_230331_02 t = new Practice_230331_02();
        int[] arr = {4, 3, 2, 1};
        int[] arr2 = {10};
        System.out.println(t.solution(arr));
        System.out.println(t.solution(arr2));
    }
}
