package EasyQuestions

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    var arrayCount = IntArray(nums.size)

    for(i in nums.indices) {
        var count = 0
        for(j in nums) {
            if(j < nums[i]) count ++
        }
        arrayCount[i] = count
    }

    return arrayCount
}

fun sortSmallerNumbers(nums: IntArray): IntArray {
    val numsCopy: IntArray = nums.clone()
    val map: HashMap<Int, Int> = HashMap()

    numsCopy.sort()

    for (i in numsCopy.indices) {
        map.putIfAbsent(numsCopy[i], i)
    }

    for (i in nums.indices) {
        nums[i] = map[nums[i]]!!
    }

    return nums
}



fun main() {
    var nums = intArrayOf(8,1,2,2,3)

    println(smallerNumbersThanCurrent(nums).contentToString())


    println(sortSmallerNumbers(nums).contentToString())
}