import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateNumber {

    // METHOD  - 1

    //  this method uses extra space
    // time complexity - O(n)

    // public static void findDuplicate1(int arr[]){
    //     HashSet<Integer> set = new HashSet<>();

    //     for(int num : arr){
    //         if(set.contains(num)){
    //             System.out.println("Duplicate Number Found : "+num);
    //             return;
    //         }
    //         set.add(num);
    //     }
    // }


    // METHOD - 2

    public static void findDuplicate2(int arr[]){
        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                System.out.println("Duplicate Number Found : "+arr[i]);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,4};

        // METHOD - 1
        // findDuplicate1(arr);

        // METHOD - 2
        findDuplicate2(arr);
    }
}
