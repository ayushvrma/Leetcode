package Algorithms_1.Day_1;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1, j = n;
        while (i < j) {
            int m = i + (j - i) / 2;
            if (isBadVersion(m)) {
                j = m;
            } else {
                i = m + 1;
            }
        }

        if (isBadVersion(i)) {
            return i;
        }

        return j;
    }
}