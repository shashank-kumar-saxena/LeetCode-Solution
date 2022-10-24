class Solution {
    public int search(int[] nums, int target) {
        if(nums[0]==target)
            return 0;
        for(int i=1;i<nums.length;i+=2)
        {
            if(nums[i]==target)
                return i;
            if(nums[i-1]==target)
                return i-1;
        }
        if(nums[nums.length-1]==target)
            return nums.length-1;
        return -1;
    }
}