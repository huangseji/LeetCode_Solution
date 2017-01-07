package algorithm.string

/**
 * @author allen on 17-1-7.
 */
class LongestPalindromicSubstring {
    fun longestPalindromicSubstring(s: String?): String {
        if (s == null || s.length <= 1) {
            return s
        }

        val chars = s.toCharArray()
        val sLen = s.length
        var maxLen = 0
        var maxStart = 0
        var index = 0
        var left: Int
        var right: Int
        var len: Int
        while (index <= sLen - maxLen / 2) {
            right = index
            left = right
            while (right < sLen - 1 && chars[right + 1] == chars[right]) {
                right++
            }
            index = right + 1
            while (left > 0 && right < sLen - 1 && chars[left - 1] == chars[right + 1]) {
                left--
                right++
            }
            len = right - left + 1
            if (maxLen < len) {
                maxLen = len
                maxStart = left
            }
        }
        return s.substring(maxStart, maxStart + maxLen)
    }
}
