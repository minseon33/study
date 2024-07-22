package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 바이러스
 * 레벨 : 실버3
 * https://www.acmicpc.net/problem/2606
 */
public class Practice_240722_02 {


    //내 풀이
    //이진트리 연습

    int count;
    static Node[] arr;

    public static class Node {
        int index;
        int lt;
        int rt;

        public Node(int index, int nextData) {
            this.index = index;
            this.lt = nextData;
        }

        public void setRt(int rt) {
            this.rt = rt;
        }

        public String toString(){
            return "index : " + index + " , lt : "+lt+" , rt : " + rt;
        }
    }

    public void DFS(Node node) {
        if (node == null){
            return;
        }else {
            DFS(arr[node.lt]);
            count++;
            DFS(arr[node.rt]);
        }
    }

    public static void main(String[] args) throws IOException {
        Practice_240722_02 practice = new Practice_240722_02();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computers = Integer.parseInt(br.readLine());
        arr = new Node[computers+1];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int nextData = Integer.parseInt(st.nextToken());

            if (arr[index]==null){
                arr[index] = new Node(index, nextData);
            }else {
                Node node = arr[index];
                node.setRt(nextData);
            }
        }
        practice.DFS(arr[1]);
        System.out.println(practice.count);
    }

    // 메모리 초과... ㅠㅠㅠ
    // 재귀를 활용하여 푸는 DFS는 스택영영의 메모리를 초과할 수 있다.
    // 재귀를 활용하지 않고 DFS푸는 방법을 고민해보자. -> 내일...


}

