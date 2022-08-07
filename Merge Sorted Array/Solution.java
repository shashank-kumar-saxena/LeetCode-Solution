class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m+n-1;
        if(m==0&&n>0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
        }
        else{
            
        m--;
        n--;
        while(m>=0&&n>=0)
        {
            if(nums1[m]>=nums2[n])
                nums1[len]=nums1[m--];
           else if(nums1[m]<=nums2[n])
                nums1[len]=nums2[n--];
           
            len--;
        }
            if(n>=0)
            {
                while(n>=0)
                {
                    nums1[len--]=nums2[n--];
                }
            }
        }
    }
}