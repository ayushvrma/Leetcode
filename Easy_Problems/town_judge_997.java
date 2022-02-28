package Easy_Problems;

import java.util.*;

public class town_judge_997 {
    public int findJudge(int n, int[][] trust) {
        if (n == 1)
            return 1;
        if (n == trust.length)
            return -1;
        HashMap<Integer, Integer> h = new HashMap<>();
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            s.add(a);
            if (h.containsKey(b)) {
                h.put(b, h.get(b) + 1);
            } else {
                h.put(b, 1);
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (h.containsKey(i) && h.get(i) == n - 1 && !s.contains(i))
                return i;
        }
        return -1;
    }
}
