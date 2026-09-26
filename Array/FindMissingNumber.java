public class FindMissingNumber {
    public static int findMissingNumber(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }

        int totalSum = (n * (n+1)) / 2;
        int misingNumber = totalSum - sum;

        return misingNumber;
    }
    public static void main(String[] args) {
        int arr[] = {0,3,4,1};

        System.out.println(findMissingNumber(arr));
    }
}
