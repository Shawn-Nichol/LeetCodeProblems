package EasyQuestions

fun blancedStringSplit(s: String): Int {
    var counter =  0
    var balance = 0
    var starter: Char? = null

    for(i in s) {

        if (balance == 0) starter = i

        if (starter == i) {
            balance ++
        } else  balance --

        if(balance == 0) counter ++
    }

    return counter
}

fun blancedStringSplitTwo(s: String): Int {
    var counter = 0
    var l = 0
    var r = 0

    for(i in s) {
        if(i == 'L') l ++
        else r++

        if(l == r) {
            counter ++
            l = 0
            r = 0
        }
    }

    return counter
}

fun balancedStringSplitThree(s: String): Int {
    var balance = 0
    var counter = 0

    for(i in s) {
        if(i == 'L') balance ++ else balance --

        if(balance == 0) counter ++
    }

    return counter
}

fun main() {
    val s = "RLRRRLLRL"

    println(balancedStringSplitThree(s))
}