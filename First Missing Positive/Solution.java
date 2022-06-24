class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)
            return(0);
        HashSet<Integer> list=new HashSet(); 
        int i;
        for(i=0;i<nums.length;i++)
            list.add(nums[i]);
        for(i=0;i<nums.length;i++)
        {
            if(!list.contains(i+1))
                break;
        }
        return(i+1);
    }
}