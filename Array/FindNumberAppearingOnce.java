import java.util.HashMap;

public class FindNumberAppearingOnce {

    // Method -- 1
    // Time Complexity - O(n)

    // public static int method1(int arr[]){
    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     for(int num : arr){
    //         if(map.containsKey(num)){
    //             map.put(num, map.get(num)+1);
    //         }else{
    //             map.put(num, 1);
    //         }
    //     }

    //     for(int num : arr){
    //         if(map.get(num) == 1)  return num;
    //     }
    //     return -1;
    // }
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,4,5,3,2,1,1,9};

        // METHOD -- 1
        // System.out.println(method1(arr));


    }
}
