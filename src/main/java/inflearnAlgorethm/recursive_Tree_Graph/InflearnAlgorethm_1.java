package inflearnAlgorethm.recursive_Tree_Graph;


/**
 * 1. 재귀함수
 */
public class InflearnAlgorethm_1 {

    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.println(n);
        }


    }


    public static void main(String[] args) {
        InflearnAlgorethm_1 T = new InflearnAlgorethm_1();
        T.DFS(3);
    }


}
