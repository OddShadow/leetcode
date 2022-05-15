package leetcode._0003_无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int ret = 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        while (j < chars.length){
            if (hashMap.containsKey(chars[j])){
                i = hashMap.get(chars[j]) + 1;
            }
            hashMap.put(chars[j], j);
            ret = Math.max(ret, (j - i + 1));
            ++j;
        }
        return ret;
    }
}
