/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,u=n;
        int pos=1;
        while(l<u)
        {
            int mid=l+(u-l)/2;
            if(isBadVersion(mid))
            {
                u=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        if(isBadVersion(l))
            return l;
        return u;
    }
}