package algorithomStudy;

import java.util.Stack;

public class Practice_230320 {

    public String solution(String s) {
        //공백을 기준으로 문자열을 잘라서 배열에 넣기
        // for문으로 배열을 돌리기.
        //for문이 문자열 길이만큼 돌면서 i가 하나씩 작아지는 for문이 돌아
        //i-1 인덱스가 짝수일때 대문자, 홀수일때 소문자 해서 스택에 넣어
        // 스택에서 꺼내서 배열에 저장하면 바른 단어가 나오겠지..?
        // 그럼 공백은 어떻게 처리하는데..? 두개의 for문이 끝나면 공백을 하나 넣어줘...?
        // 제일 끝의 공백을 삭제해주자.

        String answer = "";
        StringBuilder answer2 = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        //공백을 기준으로 문자열을 잘라서 배열에 넣기
        String[] array = s.split(" ");

        //for문을 문자열 길이만큼 돌면서 단어 뽑아내기
        for(int i = 0; i<array.length;i++){
            //단어 글자 하나하나 비교해서 대문자와 소문자로 바꿔주기
            for(int x = array[i].toCharArray().length; x > 0; x--){
                if((x-1)%2 == 0){
                    //스택에 담아주기
                    stack.push(Character.toUpperCase(array[i].toCharArray()[x-1]));
                }else {
                    stack.push(Character.toLowerCase(array[i].toCharArray()[x-1]));
                }
            }

            //스택에 담긴거 하나씩 빼서 스트링빌더에 저장하기
            for (int a = 0; a<array[i].length();a++){
                answer2.append(stack.pop());
            }
            answer2.append(" ");
        }
        //마지막 공백 제거해주기
        answer = answer2.toString().trim();
        System.out.println("최종 정답 ? " + answer2.delete(s.toCharArray().length-1,s.toCharArray().length-1));
        return answer;
}
    public static void main(String[] args) {
        Practice_230320 t = new Practice_230320();
        System.out.println(t.solution("try hello world"));

    }
}
