public class RemoveDuplicatesInSortedArray {
    public static int removeDuplicates(int arr[]) {
        if (arr.length == 0) return 0;

        int j = 0; // pointer for unique elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // new length of unique array
    }

    public static void main(String[] args) {
        int arr[] = {12,34,45,45,56,67,78,89};
        int length = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
