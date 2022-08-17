class Solution {
    public boolean isPowerOfFour(int n) {
        double d=Math.log(n)/Math.log(4);
        if(d-(int)d==0)
            return(true);
        else
            return(false);
    }
}