fun main(){
    /*
    Faça um programa que o usuário digite um número e o programa retorne o mês referente ao valor.
     */

    println("Digite o número, referente ao mês desejado: ")
    val num = readLine()!!.toInt()

    when(num){
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
    }


}