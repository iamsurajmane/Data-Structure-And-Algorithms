import java.util.Arrays;

public class RotateRightBy1 {
    public static int[] rotateRight(int arr[]){
        if(arr.length == 0) return arr;
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {34,4,5,54,3,2,123,89};
        int rotated[] = rotateRight(arr);

        System.out.println(Arrays.toString(rotated));
    }
}
