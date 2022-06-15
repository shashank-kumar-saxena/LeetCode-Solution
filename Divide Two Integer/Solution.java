class Solution {
    public int divide(int dividend, int divisor) {
        java.math.BigInteger upper=java.math.BigInteger.valueOf(dividend);
        java.math.BigInteger lower=java.math.BigInteger.valueOf(divisor);
        java.math.BigInteger result=upper.divide(lower);
        if(result.compareTo(java.math.BigInteger.valueOf(Integer.MAX_VALUE))>=0)
            {
                    return(Integer.MAX_VALUE);
            }
        else if(result.compareTo(java.math.BigInteger.valueOf(Integer.MIN_VALUE))<=0)
           { 
                    return(Integer.MIN_VALUE);
           }
        else 
           { 
            return(upper.divide(lower).intValue());
           }
       
    }
}