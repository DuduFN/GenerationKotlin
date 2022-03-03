fun main() {

    println("Digite 1 para adição " +
            "\nDigite 2 para subtração" +
            "\nDigite 3 para multiplicação" +
            "\nDigite 4 para divisão")

    println("Digite a operação dejesada: ")
    val tipo = readLine()!!.toInt()

    println("Digite o 1° número")
    val num1 = readLine()!!.toDouble()
    println("Digite o 2° número")
    val num2 = readLine()!!.toDouble()

    when(tipo){
        1 -> println("O valor de $num1 + $num2 = ${adicao(num1, num2)}")
        2 -> println("O valor de $num1 - $num2 = ${subtracao(num1, num2)}")
        3 -> println("O valor de $num1 * $num2 = ${mult(num1, num2)}")
        4 -> println("O valor de $num1 / $num2 = ${divisao(num1, num2)}")
    }
}
fun adicao(num1: Double, num2: Double):Double{
    val result = num1 + num2
    return result
}
fun subtracao(num1: Double, num2: Double):Double{
    val result = num1 - num2
    return result
}
fun mult(num1: Double, num2: Double):Double{
    val result = num1 * num2
    return result
}
fun divisao(num1: Double, num2: Double):Double{
    val result = num1 / num2
    return result
}