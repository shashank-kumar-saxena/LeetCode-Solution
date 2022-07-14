class Solution {
    public int maxProductDifference(int[] nums) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,max1=-1,max2=-1,min=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(min1>nums[i])
               { min=i;
               min1=nums[i];}
            if(max1<nums[i])
                {max=i;
                max1=nums[i];}
        }
        for(int i=0;i<nums.length;i++)
        {
            if(min2>nums[i]&&i!=min)
                min2=nums[i];
            if(max2<nums[i]&&i!=max)
                max2=nums[i];
        }
        return((max2*max1)-(min1*min2));
    }
}