import java.io.File
import java.io.FileReader

fun main(args: Array<String>){
    countChars()
    print(f(1234567890))
}

fun countChars(){
    var count = 0
    read("main.kt").forEachLine { it -> it.forEach { c: Char -> if (!c.isWhitespace()) count ++} }
    println("All chars: $count")
}

fun read(fileName: String) = FileReader(fileName)