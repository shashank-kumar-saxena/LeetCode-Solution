class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list=new HashSet();
        ArrayList<Integer> arr=new ArrayList();
        int i=0;
        for(i=0;i<nums2.length;i++)
        {
            list.add(nums2[i]);
        }
        for(i=0;i<nums1.length;i++)
        {
            if(list.contains(nums1[i]))
                {
                    arr.add(nums1[i]);
                    list.remove(nums1[i]);
                }
        }
        int a[]=new int[arr.size()];
        for(i=0;i<arr.size();i++)
        {
            a[i]=arr.get(i);
        }
        return(a);
    }
}