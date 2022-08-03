class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            int n=i,sum=0;
            while(n>0)
            {
                sum=sum+(n%10);
                n=n/10;
            }
            if(sum%2==0)
                count++;
        }
        return(count);
    }
}