class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length()==1||(s.length()==0||s.length()>1000))
        {
            return s;
        }  
        int count=0,j;
        String st="";
        st=st+s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            for(j=s.length()-1;j>i;j--)
            {
                int l=i;
                int u=j;
                while(l<u)
                {
                    if(s.charAt(l)!=s.charAt(u)){
                        count++;
                        break;
                    }
                    l++;
                    u--;
                }
                if(count==0)
                {
                    if((s.substring(i,j+1)).length()>st.length())
                    {
                        st=s.substring(i,j+1);
                    }
                    break;
                }
                count=0;
            }
        }
        return st;
}
}