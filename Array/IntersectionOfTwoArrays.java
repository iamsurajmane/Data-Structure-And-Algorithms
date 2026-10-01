import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersectionOfArray(int nums1[] , int nums2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num)){
                resultSet.add(num);
            }
        }

        int result[]  =new int[resultSet.size()];
        int idx = 0;
        for(int num : resultSet){
            result[idx] = num;
            idx++;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,2,1,3};
        int nums2[] = {1,2,2};

        int result[] = intersectionOfArray(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
