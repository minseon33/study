package inflearnAlgorethm.recursive_Tree_Graph;


/**
 * 4. 피보나치 재귀
 *
 * 재귀는 메모리도 많이 잡아먹고 시간도 오래걸리고 안좋다.
 * 그럼 재귀는 왜 있는거지..? 언제 재귀를 사용하는게 효율적인거지..?
 */
public class InflearnAlgorethm_4 {

    static int[] fibo;

    public int DFS(int n) {
        if(fibo[n]>0) return fibo[n]; // 메모제이션을 활용해서 시간복잡도를 줄여버린다.⭐중요..!
        if(n==1)  return fibo[n]= 1;
        else if (n==2) return fibo[n]= 1;
        else return fibo[n]= DFS(n-2)+DFS(n-1);

    }


    public static void main(String[] args) {
        InflearnAlgorethm_4 T = new InflearnAlgorethm_4();
        int n=10;
        fibo = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }

    }


}
