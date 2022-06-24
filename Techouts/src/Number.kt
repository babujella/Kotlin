import java.util.Scanner

fun main() {
    var reader=Scanner(System.`in`)
    while (true) {
        var input = reader.nextInt()
        if (input % 2 == 0) {
            println("$input is Even")
            return
        } else {
            println("$input is Odd")
        }
    }
}