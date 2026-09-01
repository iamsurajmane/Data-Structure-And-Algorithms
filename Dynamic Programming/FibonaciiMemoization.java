public class FibonaciiMemoization{
    public static int fibMemoization(int n,int f[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fibMemoization(n-1, f) + fibMemoization(n-2, f);
        return f[n];
    }
    public static void main(String args[]){
        int n = 6;
        int f[] = new int[n+1];
        System.out.println(fibMemoization(n,f));
    }
}
