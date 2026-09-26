import java.util.*;

public class Solution {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }

        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int index = (x ^ lastAnswer) % n;

            if (type == 1) {
                seqList.get(index).add(y);
            } else if (type == 2) {
                List<Integer> sequence = seqList.get(index);
                lastAnswer = sequence.get(y % sequence.size());
                result.add(lastAnswer);
            }
        }

        return result;
    }
}