package EasyQuestions

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var counter = 0
    var high = 0
    for(i in nums) {
        if(i == 1) {
            counter++
        }

        if(counter > high) high = counter

        if(i == 0) counter = 0
    }
    return high
}

fun main() {
    var nums = intArrayOf(1,0,1,1,0,1)
    println(findMaxConsecutiveOnes(nums))
}