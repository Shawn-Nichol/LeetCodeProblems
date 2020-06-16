package EasyQuestions

fun sortedSquares(A: IntArray): IntArray {

    for(i in A.indices) {
        A[i] = A[i] * A[i]
    }

    A.sort()
    return A
}


fun main() {
    var nums = intArrayOf(-7, -3, 2, 3, 11)

    println(sortedSquares(nums).contentToString())
}