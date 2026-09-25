public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {23,24,25,26,27};
        System.out.println(checkIfSortedOrNot(arr));
    }
    public static boolean checkIfSortedOrNot(int arr[]){
        for(int i=0;i<arr.length - 1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] < arr[i+1]){
        //         return false;
        //     }
        // }
        return true;
    }
        
    
}
