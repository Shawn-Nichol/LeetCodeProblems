package EasyQuestions

/*
    Brute force
 */
fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {

    var arr = BooleanArray(candies.size)
    var max = candies.max()



    for(i in candies.indices) {
        println("${candies[i]} + $extraCandies > $max")
        arr[i] = candies[i] + extraCandies >= max!!
    }

    return arr
}



fun main() {
    val kid = intArrayOf(2,3,5,1,3)

    println(kidsWithCandies(kid, 3).contentToString())
}