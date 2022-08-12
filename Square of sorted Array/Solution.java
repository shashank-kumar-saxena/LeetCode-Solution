class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
    int lo = 0; int hi = A.length - 1;
    for (int i = A.length - 1; i >= 0; i--) {
      if (Math.abs(A[lo]) >= Math.abs(A[hi])) {
        res[i] = A[lo] * A[lo];
          lo++;
        } else {
          res[i] = A[hi] * A[hi];
          hi--;
         }
     }
    return res;
    }
}