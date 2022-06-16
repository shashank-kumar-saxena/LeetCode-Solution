class Solution {
    public int strStr(String haystack, String needle) {
    int len=haystack.length();
    char c,ch=needle.charAt(0);
    for(int i=0;i<len;i++)
        {
            c=haystack.charAt(i);
            if(c==ch)
                {
                String st="";
                    try{
                    st=haystack.substring(i,needle.length()+i);}
                    catch(Exception e)
                        {
                            return(-1);
                        }
                    if(st.equals(needle))
                    {
                        return(i);
                    }
                }
        }
        return(-1);
    }
}