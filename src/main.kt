fun f(input: Int): String{
    val n2 = """...
...
.      .
.      .
.      .
.      .
.      .
.      .
...
...
            .
      ..
    .  .
  .    .
.      .
            .
            .
            .
            .
            .
...
...
            .
            .
...
...
.
.
...
...
...
...
            .
            .
...
...
            .
            .
...
...
.      .
.      .
.      .
.      .
...
...
            .
            .
            .
            .
...
...
.
.
...
...
            .
            .
...
...
...
...
.
.
...
...
.      .
.      .
...
...
...
...
            .
           .
          .
         .
        .
       .
      .
     .
...
...
.      .
.      .
...
...
.      .
.      .
...
...
...
...
.      .
.      .
...
...
            .
            .
...
..."""

    val a = arrayListOf<String>()
    for (i in 0 until 10){
        var s = ""
        for (e in "$input"){
            s += n.split("\n")["$e".toInt()*10 + i].replace(".", "Kotlin").padEnd(20)
        }
        a.add(s.dropLast(1))
    }
    return a.joinToString("\n")
}