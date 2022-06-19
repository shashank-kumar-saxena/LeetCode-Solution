class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
            return(0);
        long sum=0;
        char c;
        int i=0;
        boolean b=false;
        if(s.charAt(0)=='-')
        {
            i=1;
            b=true;
        }
        if(s.charAt(0)=='+')
        {
            i=1;
        }
        for(;i<s.length();i++)
        {
            c=s.charAt(i);
            if(Character.isDigit(c))
            {
                sum=sum*10+Integer.parseInt(String.valueOf(c));
                if(sum>Integer.MAX_VALUE&&b)
                    return(Integer.MIN_VALUE);
                 if(sum>Integer.MAX_VALUE)
                    return(Integer.MAX_VALUE);
        
            }
            else
            {
                break;
            }
        }
        if(b)
            sum=-sum;
        return((int)sum);
    }
}