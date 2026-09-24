public class ThirdLargest {
    public static int findThirdLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if(arr[i] > thirdLargest && arr[i] != secondLargest && arr[i] != largest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,67,80,94,32,71};
        System.out.println(arr.length);
        System.out.println("Third Largest Element : "+findThirdLargest(arr));
    }
}
