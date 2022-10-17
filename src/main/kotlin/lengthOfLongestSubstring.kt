import kotlin.math.max

/**
 * @author : 马世豪
 * time : 2022/10/14 16
 * email : ma_shihao@yeah.net
 * des :https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 */
fun lengthOfLongestSubstring(s: String): Int {


    println('p'.toInt())

    val map = IntArray(128) { -1 }
    var begin = -1
    var result = 0
    for (i in s.indices) {
        println(s[i])
        val idx = s[i].toInt()
        println("idx--->" + idx)
        println("map[${idx}]--->${map[idx]}")
        begin = begin.coerceAtLeast(map[idx])
        println("begin--->" + begin)
        result = result.coerceAtLeast(i - begin)
        println("result--->" + result)
        map[idx] = i
        println()
        println()
        println()
    }
    return result
}


fun lengthOfLongestSubstring3(s: String): Int {


    val map = hashMapOf<Char, Int>()
    var begin = -1
    var result = 0
    for (i in s.indices) {
        if (map[s[i]] != null) {
            //如果map里面有
            begin = Math.max(begin, map[s[i]]!!)
        }
        result = Math.max(result,i-begin)
        map[s[i]] = i
    }
    return result
}

fun lengthOfLongestSubstring2(s: String): Int {


    var res = mutableListOf<Char>()
    val chars = s.toCharArray().toMutableList()
    var maxSize = 0

    chars.forEachIndexed { index, c ->
        if (res.contains(c)) {
            res.add(c)
            res = res.subList(res.indexOf(c) + 1, res.size)
        } else {
            res.add(c)
        }
        println(res)
        if (maxSize < res.size) {
            maxSize = res.size
        }
    }
    return maxSize
}

fun main() {
    val str = "abababab"
    println(lengthOfLongestSubstring3(str))
}