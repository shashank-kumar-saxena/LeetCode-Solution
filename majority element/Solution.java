class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> list=new HashMap();
        for(int i:nums)
        {
            int count=list.containsKey(i)?list.get(i):0;
            count++;
            list.put(i,count);
        }
        int c=nums.length/2;
        int count=0;
        for(int i:list.keySet())
        {
            if(list.get(i)>c)
            {
                count=i;
                break;
            }
        }
        return count;
    }
}