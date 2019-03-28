fun f(input: Int): String{
    //val arr = (takeChar(0).zip(takeChar(2)).map{"${it.first}  ${it.second}"})
    //println(convert(trim(arr)))
    val nums2 = input.toString()
    println(nums2)
    println("${nums2[0]}".toInt())
    val new_arr = arrayListOf<String>()
    for (i in 0 until 10){
        var str = ""
        for (el in nums2){
            str += nums.split("\n")["$el".toInt()*10 + i].replace(".", "Kotlin").padEnd(20)
        }
        new_arr.add(str.dropLast(1))
    }
    println(new_arr.joinToString("\n"))
    return ""
}

fun convert(num: String): String{
    return num.replace(".", "Kotlin")
}


fun count(num: String): Int{
    var n = 0
    for (char in num){
        if (char != ' ' && char != '\n'){
            n ++
        }
    }
    return n
}

fun trim(array: List<String>): String{
    return array.joinToString("\n")
}
fun printChar(num: Int){
    println(convert((nums.split("\n").subList(num*10, (num+1)*10)).joinToString("\n")))
    println()
}

fun takeChar(num: Int): List<String>{
    return nums.split("\n").subList(num*10, (num+1)*10)
}