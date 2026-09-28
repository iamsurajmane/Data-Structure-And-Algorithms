public class MergeSortedArray {
    public static void mergeSorted(int nums1[] , int nums2[] , int m , int n){
        int p1 = m - 1;
        int p2 = n-1;
        int p3 = m + n - 1;

        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p3] = nums1[p1];
                p1--;
            }else{
                nums1[p3] = nums2[p2];
                p2--;
            }
            p3--;
        }
        
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;

        int nums2[] = {2,3,6};
        int n = 3;

        mergeSorted(nums1, nums2, m, n);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
