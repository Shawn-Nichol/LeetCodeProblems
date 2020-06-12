package EasyQuestions


fun decompressRLElist(nums: IntArray): IntArray {

    // create a list so you can elements to it.
    var myList = mutableListOf<Int>()

    // Loop through the array, only preforming action on odd positions.
    for (i in nums.indices step 2) {
        val counter = nums[i]
        var j = 1

        while (j <= counter) {
            myList.add(nums[i + 1])
            j++
        }
    }

    // Convert list to IntArray
    return myList.toIntArray()
}

fun decompressRLElistTwo(nums: IntArray): IntArray {

    var size = 0

    for (i in nums.indices step 2) {
        size += nums[i]
    }

    var myArr = IntArray(size)
    var startIdx = 0

    for (i in nums.indices step 2) {
        myArr.fill(nums[i + 1], startIdx, startIdx + nums[i])
        startIdx += nums[i]
    }

    return myArr
}


fun main() {
    val arr = intArrayOf(1, 4, 6, 8)

    println(decompressRLElist(arr).contentToString())
    println(decompressRLElistTwo(arr).contentToString())


}