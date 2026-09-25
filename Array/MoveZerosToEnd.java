public class MoveZerosToEnd {
    public static void moveZeros(int arr[]){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = index;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println("New Updated Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,0,4,0,0,7,8,0,9,0,8,7,6};

        moveZeros(arr);
    }
}
