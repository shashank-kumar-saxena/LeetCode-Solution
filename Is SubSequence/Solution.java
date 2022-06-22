class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return(true);
        if(t.length()==0||s.length()>t.length())
            return(false);
            return(check(t,s));
    }
    static boolean check(String s,String t)
    {
        HashSet<Character> list=new HashSet();
        int i,indexCheck=0;
        for(i=0;i<s.length();i++)
        {
            list.add(s.charAt(i));
        }
        char c;
        for(i=0;i<t.length();i++)
        {
            c=t.charAt(i);
            if(list.contains(c))
            {
                int ind=s.indexOf(c,indexCheck);
                if(indexCheck<=ind)
                {
                    indexCheck=ind+1;
                }
                else
                {
                    return(false);
                }
            }
            else
            {
                return(false);
            }
        }
        return(true);
    }
}