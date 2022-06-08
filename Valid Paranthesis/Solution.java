class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
        {
            return(false);
        }
        char a[]=new char [s.length()];
        int tos=-1;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='['||c=='{'||c=='(')
            {
                tos++;
                a[tos]=c;
            }
            else if(tos!=-1)
            {
                if(c==']'&&a[tos]=='[')
                {
                    tos--;
                }
                else if(c=='}'&&a[tos]=='{')
                {
                    tos--;
                }
                else if(c==')'&&a[tos]=='(')
                {
                    tos--;
                }
                else 
                {
                    return false;
                }
            }
            else
            {
                return(false);
            }
        }
        if(tos==-1){
        return(true);}
        return(false);
    }
}