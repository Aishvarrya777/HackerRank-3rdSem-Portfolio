import java.util.*;

public class Solution {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < n; i++) {
            diagonal1 += arr.get(i).get(i);
            diagonal2 += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(diagonal1 - diagonal2);
    }
}