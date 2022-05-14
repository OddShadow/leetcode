package leetcode._0001_两数之和;

import java.util.HashMap;

/**
 * Classical Start
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int m = target - nums[i];
            if (hashMap.containsKey(m)) {
                return new int[]{hashMap.get(m), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
