class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1&&nums[0]==target)
            return 0;
        int l=0,u=nums.length-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(nums[mid]==target)
            {   
                return mid;
            }
            else if(target>nums[mid])
            {
                l=mid+1;
            }
            else if(target<nums[mid])
            {
                u=mid-1;
            }
        }
        return -1;
    }
}