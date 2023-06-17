class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> list=new HashMap();
        for(int i=0;i<tasks.length;i++)
        {
            int count=list.containsKey(tasks[i])?list.get(tasks[i]):0;
            count++;
            list.put(tasks[i],count);
        }
        int fCount=0;
        for(int i:list.keySet())
        {
            int count=list.get(i);
            if(count<2)
            {
                return -1;
            }
            else
            {
                fCount+=(count+2)/3;
            }
        }
        return fCount;
    }
}