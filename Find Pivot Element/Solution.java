class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1)
            return(0);
        int i;
        for(i=1;i<nums.length;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        int pivot=nums[0];
        int size=nums.length;
        for(i=0;i<size;i++)
        {
            if(i==0||i==(size-1))
            {
                if(i==0&&nums[size-1]-nums[i]==0)
                   return(i); 
                if(i==(size-1)&&nums[i-1]==0)
                    return(i);
            }
            else
            {
                if(nums[i-1]==(nums[size-1]-nums[i]))
                {
                    return(i);
                }
            }
        }
        return(-1);
    }
}