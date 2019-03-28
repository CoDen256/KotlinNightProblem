import java.io.File
import java.io.FileReader

fun main(args: Array<String>){
    countChars()
    print(f(145))
}

fun countChars(){
    var count = 0
    read("numbers.kt").forEachLine { it -> it.forEach { c: Char -> if (!c.isWhitespace()) count ++} }
    println("All chars: $count")
}

fun read(fileName: String) = FileReader(fileName)