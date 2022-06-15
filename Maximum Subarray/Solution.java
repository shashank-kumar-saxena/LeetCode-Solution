class Solution {
    public int maxSubArray(int[] nums) {
        int c=0,max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(c<0)
                c=0;
            c+=i;
            max=Math.max(max,c);
        }
        return(max);
    }
}