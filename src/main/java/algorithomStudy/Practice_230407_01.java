package algorithomStudy;

// 전화번호 목록
// https://school.programmers.co.kr/learn/courses/30/lessons/42577
public class Practice_230407_01 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int minSize = Integer.MAX_VALUE;
        String minWord = "";
        int count = 0;
        //문자열 길이가 제일 짧은걸 찾는다.
        //for문을 돌면서 제일 짧은 문자열이 포함되어 있으면 count를 하나 올려준다.
        //count가 2가 되는 순간에 false리턴
        //잠깐만... 접두사...??

        for (String a : phone_book) {
            if (a.length() < minSize) {
                minSize = a.length();
                minWord = a;
            }
        }
        //for문을 돌면서 제일 짧은 문자열이 포함되어 있으면 count를 하나 올려준다.
        for (String a : phone_book) {
            if (a.contains(minWord)) {
                count++;
            }
            if (count == 2) {
                answer = false;
            }
        }
        return answer;
    }

    public boolean solution2(String[] phone_book) {
        boolean answer = true;
        int minSize = Integer.MAX_VALUE;
        String minWord = "";
        int count = 0;
        int sameWord = 0;
        //문자열 길이가 제일 짧은걸 찾는다.
        //for문을 돌면서 제일 짧은 문자열이 포함되어 있으면 count를 하나 올려준다.
        //count가 2가 되는 순간에 false리턴
        //잠깐만... 접두사...??

        for (String a : phone_book) {
            if (a.length() < minSize) {
                minSize = a.length();
                minWord = a;
            }
        }
        //for문을 minSize 크기만큼 돌면서 minWord의 인덱스값이랑 하나하나 비교해주자.
        for (String a : phone_book) {
            for (int i = 0; i < minSize; i++) {
                if (a.charAt(i) == minWord.charAt(i)) {
                    sameWord++;
                }
            }

            if (sameWord == minSize) {
                count++;
                sameWord = 0;
            } else {
                sameWord = 0;
            }

            if (count == 2) {
                return false;
            }
        }
        return answer;
    }

    public boolean solution3(String[] phone_book) {
        boolean answer = true;

        return answer;
    }

    public boolean prefix(String a ,String[] array) {
        boolean answer = true;
        // arr를 a의 길이만큼 잘라낸다. 0-x 까지 잘라낸다.
        //배열을 돌려서 a가 포함되어 있는지 확인한다.
        // a가 포함되어있는게 2개면 false를 리턴한다.
        return answer;
    }


    public static void main(String[] args) {
        Practice_230407_01 t = new Practice_230407_01();
        String[] arr = {"934793", "34", "44", "9347"};
        System.out.println(t.solution2(arr));
    }
}
