class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(nums.length==0)
            return(0);
        if(n==1)
            return(0);
        if(n==2)
        {
            n=nums[0]>nums[1]?0:1;
            return(n);
        }
        int l=0,u=n-1;
        boolean b=true;
        while(l<=u)
        {
            if(b)
            {
                b=false;
                if(nums[l]>nums[l+1])
                    return(l);
                if(nums[u]>nums[u-1])
                    return(u);
            }
            l++;
            u--;
            if(nums[l]>nums[l-1]&&nums[l]>nums[l+1])
                return(l);
            if(nums[u]>nums[u-1]&&nums[u]>nums[u+1])
                return(u);
        }
        return(0);
    }
}