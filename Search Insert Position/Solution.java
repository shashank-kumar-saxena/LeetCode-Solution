class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)
            return(nums.length);
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(target==nums[i])
                return(i);
            else if(target<nums[i])
                return(i);
        }
        return(nums.length);
    }
}