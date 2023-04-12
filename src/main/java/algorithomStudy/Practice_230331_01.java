package algorithomStudy;


import java.util.Stack;

// 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class Practice_230331_01 {

    //스택을 하나 만든다.
    //스택에 가장 앞부분에 문자열0을 넣어준다.
    //새로 만든 배열에 값들을 넣어준다.
    //for문 돌려서 나온 x 값을 스택에 저장하는데
    // x값이랑 다음 값을 비교해서 값이 올바르면 제거해준다.
    // 제거된 스택의 길이가 1 즉, 처음 설정한 0만 남았으면 올바른 괄호니까 true를 리턴하고
    // 제거된 스택의 길이가 2 이상이면 올바르지 않은 괄호니까 false를 리턴한다.
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        stack.push('0');
        for (char x : s.toCharArray()) {
            Character pop1 = stack.pop();
            if (pop1 == '0') {
                stack.push(pop1);
                stack.push(x);
            } else if (pop1 == '(' && x == ')') {
                continue;
            } else {
                stack.push(pop1);
                stack.push(x);
            }
        }

        if (stack.size() == 1) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    //정확도는 다 맞았는데...
    //효율성 테스트 2번 실패..ㅠㅠ

    boolean solution2(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        stack.push('0');
        int size = 1;

        for (char x : s.toCharArray()) {
              Character pop1 = stack.pop();
              if (pop1 == '0') {
                  stack.push(pop1);
                  stack.push(x);
                  size++;
              } else if (pop1 == '(' && x == ')') {
                  size-=2;
                  continue;
              } else {
                  stack.push(pop1);
                  stack.push(x);
                  size++;
              }
          }

        System.out.println("size : " + size);

        if (size > 0) {
            answer = false;
        } else {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        Practice_230331_01 t = new Practice_230331_01();
        String arr = "()()";
        String arr2 = "(())()";
        String arr3 = ")()(";
        String arr4 = "(()(";
        System.out.println(t.solution(arr));
        System.out.println(t.solution(arr2));
        System.out.println(t.solution(arr3));
        System.out.println(t.solution(arr4));
        System.out.println("-------------------");
        System.out.println(t.solution2(arr));
        System.out.println(t.solution2(arr2));
        System.out.println(t.solution2(arr3));
        System.out.println(t.solution2(arr4));
    }
}
