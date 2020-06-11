package EasyQuestions

/*
 * Brute force, loop through each string.
 */
fun numJewelsInStones(J: String, S: String): Int {
    if(J.isEmpty() || S.isEmpty()) return 0

    var count = 0

    for(i in J) {
        for(k in S) {
            if(i == k)
                count++
        }
    }

    return count
}

fun hashJewelsInStones(J: String, S: String): Int {
    if(J.isEmpty() || S.isEmpty()) return 0

    var counter = 0

    val map: MutableMap<Char, Char> = HashMap()

    for(i in J) {
        map[i] = i
    }

    for(i in S) {
        if(map.containsValue(i)) counter++
    }

    return counter
}



fun main() {
    val j = "aA"
    val s = "aAAbbbb"

    println(numJewelsInStones(j, s))
    println(hashJewelsInStones(j, s))

}