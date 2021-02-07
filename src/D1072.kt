fun main(args: Array<String>) {

    val n = readLine()
    var inp = 0
    var out = 0

    for(i in 1..n?.toInt()!!) {
        val n2 = readLine()?.toInt()!!
        if(n2 in 10..20) {
            inp += 1
        } else {
            out += 1
        }
    }

    println("$inp in")
    println("$out out")

}