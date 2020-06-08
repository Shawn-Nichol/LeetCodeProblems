package EasyQuestions

/*
    Uses more memory and takes longer
 */
fun optionOne(address: String): String {

    return address.replace(".", "[.]")


}

/*
    Less memory than option one and faster.
 */
fun optionTwo(address: String): String {
    val s = StringBuilder()

    for(i in address.toCharArray()) {
        if (i == '.') s.append("[.]") else s.append(i)
    }

    return s.toString()
}


fun main() {
    val ip = "1.1.1.1"

    println(optionOne(ip))
    println(optionTwo(ip))
}