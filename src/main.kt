fun f(input: Int) : String{
    val n = """3
3
.      .
.      .
.      .
.      .
.      .
.      .
3
3
            .
      2
    .  .
  .    .
.      .
            .
            .
            .
            .
            .
3
3
            .
            .
3
3
.
.
3
3
3
3
            .
            .
3
3
            .
            .
3
3
.      .
.      .
.      .
.      .
3
3
            .
            .
            .
            .
3
3
.
.
3
3
            .
            .
3
3
3
3
.
.
3
3
.      .
.      .
3
3
3
3
            .
           .
          .
         .
        .
       .
      .
     .
3
3
.      .
.      .
3
3
.      .
.      .
3
3
3
3
.      .
.      .
3
3
            .
            .
3
3"""

    fun String.r(n: Int) = replace("$n", ".".repeat(n))
    val a = arrayListOf<String>()
    for (i in 0 until 10){
        var s = ""
        for (e in "$input"){
            s += n.split("\n")["$e".toInt()*10 + i].r(3).r(2).replace(".", "Kotlin").padEnd(20)
        }
        a.add(s.dropLast(1))
    }
    return a.joinToString("\n")
}
