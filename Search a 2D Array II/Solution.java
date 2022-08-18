class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lower=0;
        int upper=matrix.length;
        
        for(int i=0;i<300;i++)
        {
                lower=0;
                upper=matrix[0].length-1;
                try{
                    if(binarySearch(matrix[i],target))
                    return(true);
                }catch(Exception e)
                {
                    break;
                }
        }
        return(false);
    }
    boolean binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return true;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
  
        // if we reach here, then element was
        // not present
        return false;
    }
}