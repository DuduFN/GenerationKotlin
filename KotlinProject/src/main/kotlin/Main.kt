fun main() {
    var opc: Int
    val cliente = Cliente(0)
    val distribuidora = Distribuidora()
    while(true) {
        println("---Seja bem-vindo a distribuidora Gen---")
        println(
            "Digite '1' para cadastrar o cliente" +
                    "\nDigite '2' se o cliente já é cadastrado"
        )

        // Menu para fazer o cadastro
        while (true) {
            try {
                opc = readln()!!.toInt()
                when (opc) {
                    1 -> {
                        println("Digite o nome do Cliente")
                        val nomeCli = readln()!!
                        println("Digite o RG do cliente")
                        val rgCli = readln()!!
                        println("Digite o CPF do cliente")
                        val cpfCli = readln()!!
                        println("Digite a idade do cliente")
                        val idadeCli = readln()!!.toInt()
                        println("Digite o endereço do cliente")
                        val endCli = readln()!!

                        cliente.cadastrar(nomeCli, rgCli, cpfCli, idadeCli, endCli)
                        distribuidora.addClientes(cliente)
                        break
                    }
                    else -> break
                }
            } catch (e: Exception) {
                println("Opção invalida")
            }
        }

        // Verificar se o cliente que pegar uma cesta
        while (true) {
            print("Gostaria de pegar uma cesta 1- Sim 2- Não ")
            try {
                opc = readLine()!!.toInt()
                if (opc == 1) {
                    // Verificar se o cliente pode pegar uma cesta
                    if (cliente.verLimite()) {
                        println("Você não pode pegar mais cestas")
                        cliente.pegarCesta = false
                        break
                    } else {
                        cliente.pegarCesta = true
                        break
                    }
                } else {
                    break
                }
            } catch (e: Exception) {
                print("Opção inválida")
            }
        }
        if (cliente.pegarCesta) {
            // Menu para escolher um tamanho de cesta
            println("Qual tamanho de cesta você deseja: ")
            println("Temos a cesta pequena que vem com 12 itens")
            println("Temos a cesta média que vem com 18 itens")
            println("Temos a cesta grande que vem com 24 itens")
            println("Digite 1- Pequena 2- Média 3- Grande")
            while (true) {
                try {
                    opc = readLine()!!.toInt()
                    cliente.escolherCesta(opc)
                    break
                } catch (e: Exception) {
                    println("Opção Inválida")
                }
            }
        }
        println(cliente)
        println("")
        println("Deseja voltar ao inicio ?")
        println("Digite '1' se não, ou digite '2' se sim")
        when(readln()!!.toInt()){
            1 -> break
        }
    }

}