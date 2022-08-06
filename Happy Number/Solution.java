class Solution {
    public boolean isHappy(int n) {
        while(true)
        {
            int s=0;
            while(n>0)
            {
                s=s+((n%10)*(n%10));
                n=n/10;
            }
            if(s==1)
                return(true);
            if(s==4)
                return(false);
            n=s;
        }
    }
}