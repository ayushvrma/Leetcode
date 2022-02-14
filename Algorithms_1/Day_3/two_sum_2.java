package Algorithms_1.Day_3;

public class two_sum_2 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        boolean flag = false;
        for (index1 = 0; index1 < numbers.length; index1++) {
            for (index2 = index1 + 1; index2 < numbers.length; index2++) {
                if (numbers[index1] + numbers[index2] == target) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        int arr[] = { index1 + 1, index2 + 1 };
        return arr;
    }
}
