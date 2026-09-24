class LargestElement{
    public static int findLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,67,6,94,32,21};

        System.out.println("Largest Element is : "+findLargest(arr));
    }
}