import java.util.*

fun main() {




    val array = intArrayOf(10,56,19)

    val max = getMax(*array)

    println(max)


// რამდენი უნიკალური ელემენტია მასივში

    //დასაწყისი
    val arrayWithDuplicates = intArrayOf(10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6)

    val hashmap = HashMap<Int, Int>()

    for (j in arrayWithDuplicates.indices) {
        hashmap[arrayWithDuplicates[j]] = j
    }

    println(hashmap.keys)

    //დასასრული

   // მასივევის თანაკვეთა

    //დასაწყისი

    val firstArray = arrayOf(1,2,3,4,5)
    val secondArray = arrayOf(2,5,6,7)

    //2
    println(Arrays.toString(firstArray))
    println(Arrays.toString(secondArray))

    //3
    val iArray = firstArray.intersect(secondArray.toList()).toIntArray()

    //4
    println(Arrays.toString(iArray))
// დსასრული


    // ორი მასივის გაერთიანება
    //დასაწყისი
    val first = arrayOf("2", "9")
    val second = arrayOf("10", "8", "4")

    val result = join(first, second)
    println(result.contentToString())

//ქვესიმრავლე

    //დასაწყისი
    val arr1 = intArrayOf(11, 1, 13, 21, 3, 7)
    val arr2 = intArrayOf(11, 3, 7, 1)
    val m = arr1.size
    val n = arr2.size

    if (isSubset(arr1, arr2, m, n)) print(
        "arr2[] არის "
                + "ქვესიმრავლე arr1-ის[] "
    ) else print(
        "arr2[] არ არის "
                + "ქვესიმრავლე arr1-ის[]"
    )
    //დასასსრული



}

// ფუნქცია ვიგებთ მახსიმუმს არაიდან
fun getMax(vararg numbers: Int):Int{

    var max = numbers [0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max

}


fun <T> join(first: Array<T>, second: Array<T>): Array<T> {
    return first + second
}

// ქვესიმრავლე
fun isSubset(
    arr1: IntArray,
    arr2: IntArray,
    m: Int, n: Int
): Boolean {
    var i = 0
    var j = 0
    i = 0
    while (i < n) {
        j = 0
        while (j < m) {
            if (arr2[i] == arr1[j]) break
            j++
        }

      if (j == m) return false
        i++
    }

   return true
}









