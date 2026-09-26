import java.util.HashSet;

public class FindDuplicateNumber {

    METHOD  - 1

    public static void findDuplicate1(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                System.out.println("Duplicate Number Found : "+num);
                return;
            }
            set.add(num);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,3};

        findDuplicate1(arr);
    }
}
