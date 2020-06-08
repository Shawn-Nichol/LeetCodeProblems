package EasyQuestions

/*
1470 shuffle the array
Given the array nums consisting of 2n elements in the form x1, x2... xn, y1, y2...yn). Alternate x and y values.
 */
fun shuffle(nums: IntArray, n: Int):IntArray {
    val ans = IntArray(n*2) // Create a new empty array the size of n * 2

    var i = 0
    var index = 0
    while( i < n) {
        ans[index] = nums[i] // place y position in ans array
        index ++ // increase index of answer array
        ans[index] = nums[i+n] // place y position in ans array
        index ++ // increase index of ans array.
        i ++ // increase x,y position
    }
    return ans
}

fun main() {
    val nums = intArrayOf(2,5,1,3,4,7)

    println(nums.contentToString())

    val newNums = shuffle(nums, 3)
    println(newNums.contentToString())
}