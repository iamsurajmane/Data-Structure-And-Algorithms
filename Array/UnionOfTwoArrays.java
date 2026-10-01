import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int[] unionOfTwoArrays(int nums1[] , int nums2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            set.add(num);
        }

        int result[] = new int[set.size()];
        int idx = 0;
        for(int num : set){
            result[idx] = num;
            idx++;
        }

        return result;
    }
    public static void main(String[] args) {
        int nums1[] = { 1,2,3,2,3,4};
        int nums2[] = {5,6,7,9,8};

        int[] result = unionOfTwoArrays(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}
