public class BinerySearch {
    public static int binerySearch(int arr[],int key){
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,66,78,89,90};
        int key = 12;
        int result = binerySearch(arr, key);
        
        if(result == -1){
            System.out.println("Element Not found in Array...");
        }
        else{
            System.out.println("Element found at index : "+result);
        }
    }
}
