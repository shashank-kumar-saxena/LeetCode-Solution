class Solution {
    public int removeElement(int[] nums, int val) {
        int l=nums.length-1,t;
        for(int i=0;i<=l;i++)
        {
            if(val==nums[i])
            {
                t=nums[i];
                nums[i]=nums[l];
                nums[l]=t;
                i--;
                l--;
            }
        }
        return(l+1);
    }
}