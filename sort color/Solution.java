class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<=1)
            return;
        int lower=0,upper=nums.length-1;
        nums=sort(nums,1);
        nums=sort(nums,2);

    }
    static int[] sort(int a[],int val)
    {
       int temp, lower=-1,middle=val;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<middle)
            {
                lower++;
                temp=a[lower];
                a[lower]=a[i];
                a[i]=temp;
            }
        }
        return(a);
    }
}