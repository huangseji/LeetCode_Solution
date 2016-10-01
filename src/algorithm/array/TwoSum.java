package algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such
 * that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 *  https://leetcode.com/problems/two-sum
 * @author Allen on 2016/10/1.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result =  new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
