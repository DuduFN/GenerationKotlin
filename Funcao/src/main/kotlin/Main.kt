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
        1 -> println("O valor de $num1 + $num2 = ${Calculadora.adicao(num1,num2)}")
        2 -> println("O valor de $num1 - $num2 = ${Calculadora.subtracao(num1,num2)}")
        3 -> println("O valor de $num1 * $num2 = ${Calculadora.mult(num1,num2)}")
        4 -> println("O valor de $num1 / $num2 = ${Calculadora.divisao(num1, num2)}")
    }
}
