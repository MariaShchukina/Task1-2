

fun main() {
 val romanNumber = "XLI"
    decode(romanNumber)
}

fun decode(str: String): Int {
    var COUNT = 0
    for(i in 0 until str.length) {
        var index = i
        if (index == str.length - 1) {
            COUNT += romanChecking(str[index])
            break
        }
        if (romanChecking(str[index]) < romanChecking(str[index+1])) {
            var result = romanChecking(str[index+1]) - romanChecking(str[index])
            COUNT += result
            COUNT -= romanChecking(str[index+1])
        } else {
            COUNT += romanChecking(str[index])
        }
    }
    println(COUNT)
    return COUNT
}


fun romanChecking(char: Char): Int {
    var number = 0
        if (char == 'I') {
             number = 1
        } else if (char == 'V') {
             number = 5
        } else if (char == 'X') {
             number = 10
        } else if (char == 'L') {
             number = 50
        } else if (char == 'C') {
             number = 100
        } else if (char == 'D') {
             number = 500
        } else if (char == 'M') {
             number = 1000
        }
    return number
}


//I          1
//V          5
//X          10
//L          50
//C          100
//D          500
//M          1,000