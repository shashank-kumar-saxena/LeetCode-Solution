class Solution {
    public boolean search(int[] nums, int target) {
        if(nums[0]==target)
            return true;
        for(int i=1;i<nums.length;i+=2)
        {
            if(nums[i]==target||nums[i-1]==target)
                return true;
        }
        if(nums[nums.length-1]==target)
            return true;
        return false;
    }
}