public class fibonaciNumber {
    public static int fibNo(int n){
        if (n == 0 || n==1){
            return n;
        } 
        int fibnm1 = fibNo(n-1);
        int fibnm2 = fibNo(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibNo(n));
    }
}
