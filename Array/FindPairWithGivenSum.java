import java.util.Arrays;
import java.util.HashMap;

public class FindPairWithGivenSum {
    public static int[] findPair(int nums[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            else{
                map.put(nums[i] , i);
            }
        }
        throw new IllegalArgumentException("No Match");
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,6,8,9,11,23,45};
        int result[] = findPair(nums, 25);
        System.out.println(Arrays.toString(result));
    }
}
