fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    // moment of truth
    if (flowerA % 2 == 0 && flowerB % 2 == 1) return true
    return flowerB % 2 == 0 && flowerA % 2 == 1
}