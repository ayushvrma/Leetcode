package Easy_Problems;

public class remove_element_27 {
    public int removeElement(int[] nums, int val) {
        int i=0; int j=0;
        while(i<nums.length){
            if(nums[i]!=val){
                j++;
                nums[j]=nums[i];
            }
            i++;
        }
        return j;
    }
}
