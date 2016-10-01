package algorithm.string;

/**
 * 3. Longest Substring Without Repeating Characters
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must
 * be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * @author Allen on 2016/10/1.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int index = 0;
        int maxLen = 0;
        String str = s.substring(index, 1);
        for (int i = 0; i < s.length(); i++) {
            int indexOf = str.indexOf(s.charAt(i));
            if (indexOf != -1) {
                index = s.lastIndexOf(s.charAt(i), i - 1) + 1;
            }
            str = s.substring(index, i + 1);
            if (maxLen < str.length()) {
                maxLen = str.length();
            }
        }
        return maxLen;
    }

}
