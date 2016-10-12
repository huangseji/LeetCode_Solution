package algorithm.linkedList;

/**
 * 4. Median of Two Sorted Arrays
* There are two sorted arrays nums1 and nums2 of size m and n respectively.
* Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
* Example 1:
* nums1 = [1, 3]
* nums2 = [2]
* The median is 2.0
* Example 2:
* nums1 = [1, 2]
* nums2 = [3, 4]
* The median is (2 + 3)/2 = 2.5
* Subscribe to see which companies asked this question
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * @author Allen on 2016/10/12.
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] nums3 = new int[len1 + len2];
        int i = 0, i1 = 0, i2 = 0;
        while (i1 < len1 && i2 < len2) {
            if(nums1[i1] < nums1[i2]) {
                nums3[i++] = nums1[i1++];
            } else {
                nums3[i++] = nums2[i2++];
            }
        }
        while (i1 < len1) {
            nums3[i++] = nums1[i1++];
        }
        while (i2 < len2) {
            nums3[i++] = nums2[i2++];
        }

        int mid = nums3.length / 2;
        if(nums3.length % 2 == 0) {
            return (double) (nums3[mid - 1] + nums3[mid]) / 2.0;
        } else {
            return (double)nums3[mid];
        }
    }

}
