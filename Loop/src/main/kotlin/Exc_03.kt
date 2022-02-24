fun main() {
    /*
    Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de
    50 anos. O programa termina quando idade for =-99. (WHILE)
     */

    var idade = 0
    var soma21 = -1
    var soma50 = 0

    while (idade != -99) {
        println("Digite a sua idade: ")
        idade = readLine()!!.toInt()
        if(idade < 21) {
            soma21++
        }else if(idade > 50){
            soma50++
        }
    }
    println("A quantidade de pessoas com menos de 21 anos é: $soma21")
    println("A quantidade de pessoas com mais de 50 anos é: $soma50")
}
