fun noSpace(x: String): String {
    return(x.replace("\\s".toRegex(), ""))
}