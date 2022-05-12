import kotlin.math.sqrt

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int {

    var ageList = listOf(age1, age2, age3, age4, age5, age6, age7, age8)

    ageList = ageList.map { x -> x * x }

    val sumOfSquare = ageList.reduce { a, b -> a + b }

    return (sqrt(sumOfSquare.toDouble()) / 2 ).toInt()
}
