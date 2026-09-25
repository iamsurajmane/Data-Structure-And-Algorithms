import java.util.*;
public class SmallestANDsecondSmallest {
    public static void findSmallestANDsecondSmallest(int arr[]){
        int smaller = Integer.MAX_VALUE;
        int secondSmaller = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < smaller){
                secondSmaller = smaller;
                smaller = arr[i];
            }
            else if(arr[i] < secondSmaller && arr[i] != secondSmaller){
                secondSmaller = arr[i];
            }
        }
        System.out.println("Smallest Element in an Array is : "+smaller);
        System.out.println("Second Smallest Element in an Array is : "+secondSmaller);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array Elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        
        findSmallestANDsecondSmallest(arr);
    }
}
