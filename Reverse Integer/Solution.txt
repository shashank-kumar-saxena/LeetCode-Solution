class Solution {
    public int reverse(int x) {
        int count=0;
        if(x<0)
        {
            x=-x;
            count++;
        }
        long s=0;
        while(x>0)
        {
            s=(s*10)+(x%10);
            x=x/10;
        }
         if (s >= Integer.MAX_VALUE) {
            return 0;
        }
        if(count>0)
        {
            return((int)-s);
        }
        return((int)s);
    }
}