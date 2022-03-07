data class Cliente(private var nome: String) {
    private var endereco = ""
    private var telefone = ""
    private var listaDeCompras = mutableListOf<String>()

    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco

    }

    constructor(nome: String, endereco: String, telefone: String) : this(nome, endereco) {
        this.telefone = telefone
    }

    init {
        println("Digite o nome do cliente")
        val nome = readLine()!!
        if (nome.isEmpty()) {
            throw Exception("O nome não pode ficar vazio")
        }
    }

    fun menu() {while (true)
    {
        println(
            "Digite 1 para adicionar um item a lista" +
                    "\nDigite 2 para remover um item da lista" +
                    "\nDigite 3 para mostrar os itens da lista"
        )

        println("Digite a opção desejada: ")
        val opc = readLine()!!.toInt()

        when (opc) {
            1 -> adicionar()
            2 -> remover()
            3 -> listar()
            else  -> break
        }
    }
}
        fun adicionar() {
            println("Digite o item que deseja adicionar: ")
            val valor = readLine()!!
            if (valor.isEmpty()) {
                println("Item inválido")
            } else {
                listaDeCompras.add(valor)
                println("$valor foi adicionado com sucesso")
            }
        }

        fun remover() {
            println("Digite o item que deseja remover: ")
            val valor = readLine()!!
            if (valor.isEmpty()) {
                println("Item inválido")
            } else if(listaDeCompras.contains(valor)){
                listaDeCompras.remove(valor)
                println("$valor removido com sucesso")
            }else{
                print("$valor não existe na lista")
            }
        }

        fun listar() {
            listaDeCompras.forEach {
                println(it)
            }
        }
}


