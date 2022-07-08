package Easy_Problems;

import java.util.ArrayList;

public class pascal2_119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> t = new ArrayList<>();

        List<Integer> r1 = new ArrayList<>();
        r1.add(1);
        if (rowIndex == 0)
            return r1;
        t.add(r1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prev_row = t.get(i - 1);
            List<Integer> curr_row = new ArrayList<>();
            curr_row.add(1);
            for (int j = 1; j < i; j++) // starting from the 2nd elements, going to i cause no. of elements = row number
            {
                curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            curr_row.add(1);
            t.add(curr_row);
        }
        return t.get(rowIndex);
    }
}
