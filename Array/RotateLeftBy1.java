import java.util.Arrays;

public class RotateLeftBy1 {
    public static int[] rotateLeft(int arr[]){
        if(arr.length == 0) return arr;
        int first = arr[0];
        for(int i=0;i<arr.length - 1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = first;

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,43,32,24,67};

        int rotated[] = rotateLeft(arr);
        System.out.println(Arrays.toString(rotated));
    }
}
