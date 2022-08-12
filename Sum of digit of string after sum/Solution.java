class Solution {
    public int getLucky(String s, int k) {
        int sum=0,sum1=0;
        for(int i=0;i<s.length();i++)
        {
            sum1=((int)(s.charAt(i))-96);
            sum=sum+(sum1%10)+(sum1/10);
        }
        k--;
        while(k>0)
        {
            sum1=0;
            while(sum>0)
            {
                sum1=sum1+(sum%10);
                sum=sum/10;
            }
            sum=sum1;
            k--;
        }
        return(sum);
    }
}