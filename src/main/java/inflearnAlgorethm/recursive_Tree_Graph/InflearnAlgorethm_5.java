package InflearnAlgorethm.Recursive_Tree_Graph;


import java.sql.SQLOutput;

/**
 * 5. 이진트리 순회(DFS) 깊이 우선 탐색
 *
 */

class Node{
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null; //말단 노드의 lt,rt 값은 null이다.
    }
}
public class InflearnAlgorethm_5 {

    Node root;

    public void DFS(Node root) {
        if(root==null) return;
        else {
            //여기서 System.out.print(root.data + " "); 하면 전위순회
            DFS(root.lt);
            System.out.print(root.data + " ");
            //여기서 System.out.print(root.data + " "); 하면 중위순회
            DFS(root.rt);
            //여기서 System.out.print(root.data + " "); 하면 후위순회
        }
    }


    public static void main(String[] args) {
        InflearnAlgorethm_5 tree = new InflearnAlgorethm_5();
       tree.root = new Node(1);
       tree.root.lt = new Node(2);
       tree.root.rt = new Node(3);
       tree.root.lt.lt = new Node(4);
       tree.root.lt.rt = new Node(5);
       tree.root.rt.lt = new Node(6);
       tree.root.rt.rt = new Node(7);

       tree.DFS(tree.root);

    }


}
