public class LinearSearch {
    public static boolean search(int arr[] , int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {22,34,54,32,21,24,56};
        int k = 56;

        System.out.println(search(arr, k));
    }
}
