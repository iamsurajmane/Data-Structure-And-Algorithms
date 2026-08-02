import java.util.*;
class MinimumSumAbsoluteDiffrence{
    public static void main(String args[]){
        int A[]={3,1,2};
        int B[]={1,3,2};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);

        } 
        System.out.println("Minimun absolute diffrence of pairs : "+minDiff);
    }
}