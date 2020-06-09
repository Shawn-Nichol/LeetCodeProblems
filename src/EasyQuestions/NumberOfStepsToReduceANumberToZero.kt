package EasyQuestions

/*
 * While loop
 */
fun numberOfSteps (num: Int): Int {
    var counter = 0
    var myNum = num

    while(myNum != 0) {
        if(myNum % 2 == 0) myNum /= 2 else myNum -= 1
        counter ++
    }

    return counter
}


fun numberOfSteps2(num: Int, count: Int = 0): Int {

    return when {
        num == 0 -> count
        num % 2 == 0 -> numberOfSteps2(num / 2, count + 1)
        else -> numberOfSteps2(num - 1, count + 1)
    }
}


fun main() {
    var num  = 8
    println("Number of steps to reduce to zero ${numberOfSteps2(num)}")
}