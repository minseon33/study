package algorithomStudy;

import java.util.ArrayList;

// 카드뭉치
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Practice_230412_02 {
    //배열을 for문 돌려서 goal에 포함하면 goal에서 포함된 문자열 지워준다.
    //마지막에 goal의 길이를 재서 길이가 0이면 예스 출력, 아니면 노 출력

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        ArrayList<String> goalList = new ArrayList<>();
        for (String a : goal) {
            goalList.add(a);
        }
        for (String a : cards1) {
            if (goalList.contains(a)) {
                goalList.remove(a);
            }
        }
        for (String x : cards2) {
            if (goalList.contains(x)) {
                goalList.remove(x);
            }
        }

        if (goalList.size() == 0) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        return answer;
    }

    public String solution2(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        ArrayList<String> goalList = new ArrayList<>();
        for (String a : goal) {
            goalList.add(a);
        }
        if (goal[0].equals(cards1[0])) {
            goalList.remove(goal[0]);
        }

        for (String x :
                cards2) {
            goalList.remove(x);
        }

        for (int i = 1; i < cards1.length; i++) {
            if (cards1[i].equals(goal[cards2.length + i])) {
                goalList.remove(cards1[i]);
            }
        }

        if (goalList.size() == 0) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        return answer;
    }

    public String solution3(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < goal.length; i++) {
            if(aIndex<cards1.length && goal[i].equals(cards1[aIndex])){
                aIndex++;
            } else if (bIndex<cards2.length && goal[i].equals(cards2[bIndex])) {
                bIndex++;
            }else {
                answer = "No";
                return answer;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Practice_230412_02 t = new Practice_230412_02();
        String[] a = {"i", "drink", "water"};
        String[] b = {"want", "to"};
        String[] n = {"i", "want", "to", "drink", "water"};
        System.out.println(t.solution3(a, b, n));
    }
}
