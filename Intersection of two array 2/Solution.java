class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> list=new HashMap();
        ArrayList<Integer> ans=new ArrayList();
        for(int i:nums1)
        {
            int count=list.containsKey(i)?list.get(i):0;
            count++;
            list.put(i,count);
        }
        for(int i:nums2)
        {
            if(list.containsKey(i))
            {
                int a=list.get(i);
                if(a==0)
                {
                    continue;
                }
                list.put(i,a-1);
                ans.add(i);
            }
        }
        int count=0;
        int result[]=new int[ans.size()];
        for(int i:ans)
        {
            result[count++]=i;
        }
        return result;
    }
}