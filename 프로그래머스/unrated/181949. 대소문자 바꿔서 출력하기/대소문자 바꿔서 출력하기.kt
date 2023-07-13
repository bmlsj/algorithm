fun main(args: Array<String>) {
    var s1 = readLine()!!
    
    val sl = s1.toMutableList()
    for(i in sl.indices) {
        if(sl[i].isUpperCase()) {
            sl[i] = sl[i].toLowerCase()
        }
        else if(sl[i].isLowerCase()) {
            sl[i] = sl[i].toUpperCase()
        }
    }

    println("${sl.joinToString("")}")
}