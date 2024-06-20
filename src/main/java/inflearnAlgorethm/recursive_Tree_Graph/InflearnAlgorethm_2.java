package inflearnAlgorethm.recursive_Tree_Graph;


/**
 * 1. 재귀함수를 활용하여 이진수 출력
 */
public class InflearnAlgorethm_2 {

    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2+" ");
        }


    }


    public static void main(String[] args) {
        InflearnAlgorethm_2 T = new InflearnAlgorethm_2();
        T.DFS(11);
    }


}
