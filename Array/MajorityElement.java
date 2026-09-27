import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }else{
                map.put(nums[i] , 1);
            }
        }
        int result = 0;
        int majority = nums.length / 2;

        for(HashMap.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue() > majority){
                result = entry.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,1,2,1,2,2,1,2,1,2,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2};

        System.out.println(majorityElement(nums));
    }
}
