class Solution {
    public boolean wordPattern(String pattern, String st) {
        String p[]=pattern.split("");
        String s[]=st.split(" ");
        if(p.length!=s.length)
            return false;
        HashMap<String,String> list=new HashMap();
        HashSet<String> list2=new HashSet();
        for(int i=0;i<s.length;i++)
        {
            if(list.containsKey(p[i]))
            {
                if(list.get(p[i]).equals(s[i]))
                {

                }
                else
                {
                    return false;
                }
            }
            list.put(p[i],s[i]);
            list2.add(s[i]);
        }
        if(list.size()!=list2.size())
            return false;
        return true;
    }
}