public class MaximunSubarray {
    // Brute Force Approach
    // Time Complexity : O(n2)
    public static int maxSum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int currSum = 0;
            for(int j=i;j<nums.length;j++){
                currSum += nums[j];
                maxSum = Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSum(nums));
    }
}
