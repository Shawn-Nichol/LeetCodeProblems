package EasyQuestions

//fun duplicateZeros(arr: IntArray): Unit {
//    for(i in arr.indices) {
//        println("Index $i ${arr[i]}")
//
//        if (arr[i] == 0) {
//            var index = arr.size - 2
//            while (i < index) {
//                println("$index ${arr[index]} ${arr[index + 1]}")
//                arr[index + 1] = arr[index]
//                index--
//                println(arr.contentToString())
//            }
//            println("while loop ends ${arr[i]}")
//            arr[i + 1] = 0
//
//        } else { println("${arr[i]} do nothing")}
//    }
//
//    println(arr.contentToString())
//}

fun duplicateZeros(arr: IntArray): Unit {
    var index = 0 // starting position
    var size = arr.size
    println(size)

    while (index < size) {
        // If index = 0, we need to run code.
        if(arr[index] == 0) {

            for(j in size - 1 downTo index + 1) {
                arr[j] = arr[j -1] // set the current arr position to the value of the index before it.
            }
            index += 2 // Plus 2 to skip the index that was just set to 0
        } else {
            index ++
        }
    }

    println(arr.contentToString())
}

fun main() {
    val nums = intArrayOf(1,0,2,3,0,4,5,0)

    println(duplicateZeros(nums))
}