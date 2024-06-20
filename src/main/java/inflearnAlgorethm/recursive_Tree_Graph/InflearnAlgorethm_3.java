package inflearnAlgorethm.recursive_Tree_Graph;


/**
 * 3. 팩토리얼
 */
public class InflearnAlgorethm_3 {


    public int DFS(int n) {
        if(n==1) return 1;
        else {
            return n*DFS(n-1);
        }


    }


    public static void main(String[] args) {
        InflearnAlgorethm_3 T = new InflearnAlgorethm_3();
        System.out.println(T.DFS(5));
        
    }


}
