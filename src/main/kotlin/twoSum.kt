/**
 * @author : 马世豪
 * time : 2022/10/14 15
 * email : ma_shihao@yeah.net
 * des :https://leetcode.cn/problems/two-sum/
 */

fun twoSum(nums: IntArray, target: Int): IntArray? {

    val size = nums.size
    for (i in 0 until size - 1) {
        val x = nums[i]
        if (nums.contains(target - x)) {
            val z = nums.find {
                it == target - x
            }
            val index = nums.lastIndexOf(z!!)
            if (i != index) {
                return arrayOf(i,index).toIntArray()
            }
        }
    }

    return emptyArray<Int>().toIntArray()
}

fun main() {

    val nums = arrayOf(3, 3).toIntArray()
    val target = 6

    twoSum(nums, target)?.forEach {
        println(it)
    }

}