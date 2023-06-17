class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return(nums[0]);
        HashSet<Integer> list=new HashSet();
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]))
                list.add(nums[i]);
            else
            {
                list.remove(nums[i]);
            }
        }
        for(int ii:list)
        {
            i=ii;
        }
        return(i);
    }
}