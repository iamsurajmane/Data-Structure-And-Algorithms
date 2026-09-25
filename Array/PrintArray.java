public class PrintArray {
    public static void printArray(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int arr[] = {34,65,67,87,89,90};
        printArray(arr);
    }
}
