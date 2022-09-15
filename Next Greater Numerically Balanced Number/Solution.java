class Solution {
    public int nextBeautifulNumber(int num) {
        HashMap<Integer,Integer> list=new HashMap();
        int s,r;
        num++;
        while(true)
        {
            s=num;
            list.clear();
            while(s>0)
            {
               r=s%10;
                int count=list.containsKey(r)?list.get(r):0;
                count++;
                list.put(r,count);
                s=s/10;
            }
            int count=0;
            for(int i:list.keySet())
            {
                if(!(i==list.get(i)))
                {
                    count++;
                    break;
                }
            }
            if(count==0)
                return(num);
            num++;
        }
    }
}