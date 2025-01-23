fun main() {

    /*
    Написать анонимную функцию – поздравление с наступающим новым годом.
    Ее тип следующий (String, Int) -> String.
    Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют.
    Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.
    */
    val happyNewYearGreetings = fun(name: String, year: Int) = "$name, happy new year $year."
    happyNewYearGreetingsIvan("Ivan", 2025, happyNewYearGreetings)
    println()

    /*
    Создать массив целых чисел произвольного размера.
    Написать анонимную функцию isEven, проверяющую число на четность, она возвращает логический тип.
    Написать функцию checkArrayElement проверки массива и его элементов на четность,
    она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
    */
    val array = intArrayOf(4, 6, 8, 0, 23, 12, 45, 56, 77)
    val isEven = fun(integer: Int) = integer % 2 == 0
    checkArrayElement(array, isEven)
    println()

    /*
    Напишите анонимную функцию для объединения двух строк и возврата результата.
    */
    val strOne = "Ivan, happy n"
    val strTwo = "ew year 2025."
    val stringConcatenation = fun(a: String, b: String) = a + b
    println(stringConcatenation(strOne, strTwo))
}

fun happyNewYearGreetingsIvan(name: String, year: Int, function: (String, Int) -> String) {
    println(function(name, year))
}

fun checkArrayElement(array: IntArray, function: (Int) -> Boolean) {
    for (a in array) println("$a - ${function(a)}")
}
