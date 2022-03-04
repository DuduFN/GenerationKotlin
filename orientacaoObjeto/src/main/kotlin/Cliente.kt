class Cliente  {

    var nome = ""
    var tempoCliente= 0.0
    var pagmntEmDia= ""
    var idade = 0

    fun pagmntCli(valor: String) {
        if (pagmntEmDia == "sim" || pagmntEmDia == "Sim") {
            println("O cliente $nome está com o pagamento em dia.")
        } else if (pagmntEmDia == "Não" || pagmntEmDia == "Nao" || pagmntEmDia == "não" || pagmntEmDia == "nao") {
            println("O cliente $nome não está com o pagamento em dia.")
        } else {
            println("Dado invalido")
        }
    }

    fun bonus(valor: Double) {
        if (tempoCliente >= 0.6 && tempoCliente <= 2.0) {
            print("O cliente possui beneficios do Nivel 1")
        } else if (tempoCliente >= 2.1 && tempoCliente <= 3.7) {
            println("O cliente possui beneficios do Nivel 2")
        } else if (tempoCliente >= 2.7 && tempoCliente <= 4.7) {
            println("O cliente possui beneficios do Nivel 3")
        } else if (tempoCliente >= 4.7) {
            println("O cliente possui beneficios do Nivel 4")
        }else{
            println("O cliente não possui beneficios")
        }
    }
}