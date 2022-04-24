import kotlin.math.floor

fun litres(time: Double): Int {
    var litres = floor(time * 0.5)
    return litres.toInt()
}