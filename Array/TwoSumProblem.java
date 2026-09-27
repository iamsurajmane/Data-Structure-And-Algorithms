import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    // Brute force approach
    // Time Complexity = O(n2)

    public static int[] twoSum1(int nums[] , int target){
        for(int i=0;i<nums.length - 1;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{};
    }
    // Optimized Approach using HASHMAP...
    public static int[] twoSum2(int nums[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n = target - nums[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n) , i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;

        // int arr[] = twoSum1(nums, target);
        // System.out.println("Index Position of sum equal target is : " + Arrays.toString(arr));

        int arr[] = twoSum2(nums, target);
        System.out.println("Index Position of sum equal target is : " + Arrays.toString(arr));
    }
}
