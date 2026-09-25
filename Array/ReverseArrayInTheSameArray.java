import java.util.Arrays;

public class ReverseArrayInTheSameArray {
    public static void main(String[] args) {
        int arr[] = {34,54,67,87,54,33,23,67,98,86};

        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
