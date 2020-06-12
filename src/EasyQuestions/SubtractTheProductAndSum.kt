package EasyQuestions

fun subtractProductAndSum(n: Int): Int {
    var num = n
    var myList = mutableListOf<Int>()

    while (num > 0) {
        println("${num / 10} + ${num % 10}")
        myList.add(num % 10)
        num /= 10
    }

    var multiple = 1

    for (i in myList) {
        if (i == 0) {
            multiple = 0
            break
        }
        multiple *= i
    }

    return multiple - myList.sum()
}

fun subtractProductAndSumTwo(n: Int): Int {
    var product = 1
    var sum = 0
    var num = n

    while(num > 0) {
        sum += num % 10
        product *= num % 10
        num /= 10
    }

    return product - sum
}


    fun main() {
        var n = 4421

        println(subtractProductAndSumTwo(n))
    }