/**
 * @author : 马世豪
 * time : 2022/10/17 10
 * email : ma_shihao@yeah.net
 * des :https://leetcode.cn/problems/median-of-two-sorted-arrays/
 */


fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

    val nums = nums1 + nums2
    nums.sort()
    val size = nums.size
    var result: Double = 0.0
    if (size % 2 == 0) {
        result = (nums[(size / 2)-1] + nums[size / 2 ]) / 2.0
    } else {
        result = nums[((size + 1) / 2)-1] / 1.0
    }

    return result
}

fun main() {

    val nums1 = arrayOf(1, 3).toIntArray()
    val nums2 = arrayOf(2,4).toIntArray()
    println(findMedianSortedArrays(nums1, nums2))
}