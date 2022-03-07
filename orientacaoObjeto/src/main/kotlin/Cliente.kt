class Cliente  {

    var nome = ""
    var tempoCliente= 0.0
    var pagmntEmDia= ""
    var idade = 0

    fun pagmntCli(valor: String) {
        println("Digite o pagamento está em dia: ")
        val valor = readLine()!!

        if (valor == "sim" || valor == "Sim") {
            println("O cliente $nome está com o pagamento em dia.")
        } else if (valor == "Não" || valor == "Nao" || valor == "não" || valor == "nao") {
            println("O cliente $nome não está com o pagamento em dia.")
        } else {
            println("Dado invalido")
        }
    }

    fun bonus(valor: Double) {
        println("Digite quanto tempo o $nome é cliente da empresa: ")
        val valor = readLine()!!.toDouble()

        if (valor >= 0.6 && valor <= 2.0) {
            print("O cliente possui beneficios do Nivel 1")
        } else if (valor >= 2.1 && valor <= 3.7) {
            println("O cliente possui beneficios do Nivel 2")
        } else if (valor >= 2.7 && valor <= 4.7) {
            println("O cliente possui beneficios do Nivel 3")
        } else if (valor >= 4.7) {
            println("O cliente possui beneficios do Nivel 4")
        }else{
            println("O cliente não possui beneficios")
        }
    }
}