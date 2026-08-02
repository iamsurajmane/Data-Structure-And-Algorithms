public class SumOfFirstNNaturalNo {
    public static int sumOfFirstNNaturalNo(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumOfFirstNNaturalNo(n - 1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(sumOfFirstNNaturalNo(n));
    }
}
