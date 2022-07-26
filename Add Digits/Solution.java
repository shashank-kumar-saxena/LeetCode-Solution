class Solution {
    public int addDigits(int num) {
        while(true)
        {
            int s=0;
            while(num>0)
            {
                s=s+(num%10);
                num=num/10;
            }
            if(s<=9)
            {
                return(s);
            }
            num=s;
        }
    }
}