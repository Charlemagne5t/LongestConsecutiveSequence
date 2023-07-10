import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 1;
        for (int i = 0; i < nums.length; i++) {

            if(!set.contains(nums[i] - 1)){
                int count = 1;
                while (set.contains(nums[i] + count)){
                    count++;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }
}
