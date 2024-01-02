import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElementNaive(int[] nums) {
        HashMap<Integer, Integer> elementCounterHashMap = new HashMap<>();
        for (Integer num : nums) {
            elementCounterHashMap.merge(num, 1, Integer::sum);
        }
        Integer maxElementCount = Integer.MIN_VALUE;
        Integer maxElementKey = null;
        for (Map.Entry<Integer, Integer> entry : elementCounterHashMap.entrySet()) {
            Integer value = entry.getValue();
            if (value > maxElementCount) {
                maxElementKey = entry.getKey();
                maxElementCount = value;
            }
        }
        return maxElementKey;
    }
}
