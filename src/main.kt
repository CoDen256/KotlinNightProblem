fun f(input: Int) : String{
    val n = "7      2      2      2      2      2      7            1      2    1  1  1    2      1            1            1            1            1            7            1            17            1            66            1            7            1            17      2      2      2      16            1            1            1            17            1            6            1            77            1            61      2      76            1           1           1           1           1           1           1           1       7      2      17      2      77      2      16            1            7"
        .apply {

        }
    fun String.r(n: Int) = replace("$n", "Kotlin".repeat(n))
    val a = arrayListOf<String>()
    for (i in 0..9) {
        var s = ""
        for (e in "$input") {
            val x = 18*("$e".toInt()*10 + i)
            s += n.r(7).r(6).r(2).r(1).substring(x, x + 18).padEnd(20)
        }
        a.add(s.dropLast(1))

    }
    return a.joinToString("\n")
}
