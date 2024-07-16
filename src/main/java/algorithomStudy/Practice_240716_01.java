package algorithomStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 이진트리순회 연습
 */
public class Practice_240716_01 {
    Node root;

    //내 풀이
    //이진트리 연습
    static class Node{
        int data;
        Node lt,rt;
        public Node(int val){
          data=val;
          lt=rt=null;
        }
    }

    public void DFS(Node root) {
        if(root==null){
            return;
        }else {
//            System.out.print(root.data + " "); //전위순회
            DFS(root.lt);
            System.out.print(root.data + " ");// 중위순회
            DFS(root.rt);
//            System.out.print(root.data + " ");//후위순회
        }
    }
    public static void main(String[] args) throws IOException {
        Practice_240716_01 practice = new Practice_240716_01();
        practice.root = new Node(1);
        practice.root.lt = new Node(2);
        practice.root.rt = new Node(3);
        practice.root.lt.lt = new Node(4);
        practice.root.lt.rt = new Node(5);
        practice.root.rt.lt = new Node(6);
        practice.root.rt.rt = new Node(7);
        practice.DFS(practice.root);
    }
}
