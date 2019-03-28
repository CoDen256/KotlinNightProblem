fun main(args: Array<String>){
    print(f(1))

    for (num in nums){
        println(replace(num))
        println(count(num))
    }
}

fun f(input: Int): String{

    return ""
}

fun convert(num: String): String{
    return num.replace(".", "Kotlin")
}

fun replace(n: String): String = n.replace("\n", "\\n")

fun count(num: String): Int{
    var n = 0
    for (char in num){
        if (char != ' ' && char != '\n'){
            n ++
        }
    }
    return n
}