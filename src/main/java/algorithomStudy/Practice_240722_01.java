package algorithomStudy;

import java.io.IOException;

/**
 * 부분집합구하기(DFS) 연습
 */
public class Practice_240722_01 {


    //내 풀이
    //이진트리 연습
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if(L == n+1){
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i]==1){
                    tmp += (i + " ");
                }
            }
            if (tmp.length()>0) System.out.println(tmp);
        }else {
            ch[L]=1;
            DFS(L+1); // 왼쪽으로 뻗는다. (사용한다)
            ch[L]=0;
            DFS(L+1); // 오른쪽으로 뻗는다.(사용안한다)
        }
    }
    public static void main(String[] args) throws IOException {
        Practice_240722_01 practice = new Practice_240722_01();
        n=3;
        ch = new int[n + 1];
        practice.DFS(1);
    }
}
