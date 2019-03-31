fun f(input: Int) : String{
    fun String.r(n: Int) = replace("$n", "Kotlin".repeat(n))
    var i = 0
    return generateSequence {
        var s = ""
        for (e in "$input") {
            val x = 18*((e-'0')*10 + i)
            s += "7      2      2      2      2      2      7            1      2    1  1  1    2      1            1            1            1            1            7            1            17            1            66            1            7            1            17      2      2      2      7            1            1            1            17            1            6            1            77            1            7      2      76            1           1           1           1           1           1           1           1       7      2      17      2      77      2      7            1            7"
                .r(7).r(6).r(2).r(1).substring(x, x + 18).padEnd(20)
        }
        i++
        s.dropLast(1)
    }.take(10).joinToString("\n")

}
