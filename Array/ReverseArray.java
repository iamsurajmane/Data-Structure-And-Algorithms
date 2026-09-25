public class ReverseArray {
    public static void reverseArray(int arr[]){
        int reversed[] = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1;i>=0;i--){
            reversed[index] = arr[i];
            index++;
        }
        System.out.println("Original Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed Array is : ");
        for(int i=0;i<reversed.length;i++){
            System.out.print(reversed[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {45,43,23,56,765,43};
        reverseArray(arr);
    }
}
