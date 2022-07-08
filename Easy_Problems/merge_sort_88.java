package Easy_Problems;

public class merge_sort_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 has digits on first m indeces. total length of m+n, n is length of nums2
        int p1 = m-1; // 1st pointer
        int p2 = n-1; //2nd pointer
        int i = nums1.length-1; // start filling largest digits from the end of the array
        while(p1>=0 && p2>=0){
            if(nums2[p2]>nums1[p1]){
                nums[i] = nums2[p2];
                p2--;
            }
            else{
                nums[i] = nums1[p1];
                p1--;
            }
            i--;
        }
        while(p2>0){
            nums1[i--] = nums2[p2--];
        }
    }
}
