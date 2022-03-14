class Cliente(
    override var id: Int
): DadosCliente {
    override var nome = ""
    override var rg = ""
    override var cpf = ""
    override var endereco = ""
    override var idade = 0
    private var limite = 4
    var nCestas = 0
    var pegarCesta = false

    fun cadastrar(nomeCli: String, rgCli: String, cpfCli: String, idadeCli: Int, endCli: String) {
         nome = nomeCli
         rg = rgCli
         cpf = cpfCli
         idade = idadeCli
         endereco = endCli
    }
    fun verLimite():Boolean{
        if(nCestas >= limite){
            println("O cliente $nome estorou o limite de cestas")
            return true
        }else{
            println("O cliente $nome pode pegar mais cestas")
        return false
    }
    }

    fun escolherCesta(opc: Int){
    when(opc){
        1 -> {
            println("Você selecionou a cesta pequena")
            nCestas++
        }
        2 -> {
            println("você selecionou a cesta média")
            nCestas++
        }

        3 -> {
            println("Você selecionou a cesta grande")
            nCestas++
        }

    }

    }

    override fun toString(): String {
        return "$nome, $rg, $cpf, $endereco, $idade "
    }
}

