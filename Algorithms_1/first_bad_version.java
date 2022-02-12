package Algorithms_1;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for (int i = n; i >= 2; i--) {
            if (isBadVersion(i) && !isBadVersion(i - 1))
                return i;
        }
        return 1;
    }
}