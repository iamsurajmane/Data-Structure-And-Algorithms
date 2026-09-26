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

    // it does not uses extra space 
    // but beacause of sorting    time complexity is : O(nlog(n))

    // public static void findDuplicate2(int arr[]){
    //     Arrays.sort(arr);

    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i] == arr[i-1]){
    //             System.out.println("Duplicate Number Found : "+arr[i]);
    //             return;
    //         }
    //     }
    // }


    // METHOD - 3

    // No extra space  because we do not modify the array we calculte in the array itself
    // Time Complexity : O(n)
    // this is one optimized solution 
    // Floyyeds cycle detection

    public static int findDuplicate3(int arr[]){
        int slow = arr[0];
        int fast = arr[0];

        // Phase 1: Detect cycle
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow != fast);

        // Phase 2: Find entry point (duplicate)
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return fast;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,5};

        // METHOD - 1
        // findDuplicate1(arr);

        // METHOD - 2
        // findDuplicate2(arr);

        // METHOD - 3
        System.out.println("Duplicate Number is :" + findDuplicate3(arr));
    }
}
