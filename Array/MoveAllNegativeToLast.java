import java.util.Arrays;

public class MoveAllNegativeToLast {
    public static int[] moveNegative(int nums[]){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] > 0){
                left++;
            }
            else if(nums[right] < 0){
                right--;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,5,6,-8,9,-6};

        int result[] = moveNegative(nums);

        System.out.println(Arrays.toString(result));
    }
}
