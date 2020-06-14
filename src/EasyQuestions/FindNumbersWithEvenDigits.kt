package EasyQuestions

import kotlin.math.log10

fun findNumbers(nums: IntArray): Int {
    var counter = 0

    for(i in nums) {
        val str = i.toString()
        if(str.length % 2 == 0) counter++

    }

    return counter
}

/*
 * log: Logarithmic function is the reverse of power
 * so instead of 2 to the power of 4 = 16 you would have log 2(16) and solve for the 4
 */
fun findNumbersTwo(nums: IntArray): Int {
    var counter = 0

    for(i in nums) {
        val digits = (log10(i.toDouble()) + 1).toInt()
        if(digits % 2 == 0) counter++
    }

    return counter
}

fun main() {
    val nums = intArrayOf(12,345, 2,6, 7896)
    val nums2 = intArrayOf(555, 901, 482, 1771)
    println(findNumbers(nums))
    println(findNumbersTwo(nums2))

}