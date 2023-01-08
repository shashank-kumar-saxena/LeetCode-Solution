class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int list[]=new int[queries.length];
        int sum=0,count=0;
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++)
        {
            sum=0;
            count=0;
            for(int j=0;j<nums.length;j++)
            {
                if((sum+nums[j])<=queries[i])
                {
                    sum=sum+nums[j];
                    count++;
                    continue;
                }
                break;
            }
            list[i]=count;
        }
        return list;
    }
}