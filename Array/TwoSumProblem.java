import java.util.Arrays;

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
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 13;

        int arr[] = twoSum1(nums, target);
        System.out.println("Index Position of sum equal target is : " + Arrays.toString(arr));
    }
}
