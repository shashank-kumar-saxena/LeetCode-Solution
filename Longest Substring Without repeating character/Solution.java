class Solution {
    public int lengthOfLongestSubstring(String s) {
        String st="";
        int max=0,index=0,count=0;
        boolean b=false;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(st.indexOf(c)==-1)
            {
                st=st+c;count=0;
            }
            else 
            {
                b=true;
                if(max<st.length())
                {max=st.length();}
                count=1;
                i=s.indexOf(c,index);
                index=i+1;
                st="";
            }
        }
        if(count==0&&(max<st.length()))
            return(st.length());
        if(b)
          return(max);
        return(st.length());
    }
}