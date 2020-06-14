package EasyQuestions

import java.util.*

// Use a list.add as it push all elements to the right after insert
fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val myList = ArrayList<Int>()

    for (i in nums.indices) {
        myList.add(index[i], nums[i])
    }

    return myList.toIntArray()
}

// Converting the array your self tends to be faster than using .convertTo
fun createTargetArrayTwo(nums: IntArray, index: IntArray): IntArray {
    val myList = ArrayList<Int>()

    for (i in nums.indices) {
        myList.add(index[i], nums[i])
    }

    val myArray = IntArray(myList.size)
    for(i in myArray.indices) {
        myArray[i] = myList[i]
    }


    return myArray
}

fun main() {
    var nums = intArrayOf(0, 1, 2, 3, 4)
    var index = intArrayOf(0, 1, 2, 2, 1)


    println(createTargetArray(nums, index).contentToString())
}