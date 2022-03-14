class Distribuidora {
    private var cestasPequenas = 10
    private var cestasMedias = 10
    private var cestasGrandes = 10

   private val qntClientes  = mutableListOf<Cliente>()

    fun reabastecer(qntPequena: Int, qntMedia: Int, qntGrande: Int) {
        cestasPequenas += qntPequena
        cestasMedias += qntMedia
        cestasGrandes += qntGrande
    }

    fun entregarCesta(opc: Int) {
        when(opc) {
            1 -> {
                if(cestasPequenas <= 0){
                    println("Infelizmente acabaram as cestas pequenas")
                }else {
                    cestasPequenas--
                    println("Cesta pequena entregue com sucesso")
                }
            }
            2 -> {
                if(cestasMedias <= 0){
                    println("Infelizmente acabaram as cestas média")
                }else {
                    cestasMedias--
                    println("Cesta média entregue com sucesso")
                }
            }
            3 -> {
                if(cestasGrandes <= 0){
                    println("Infelizmente acabaram as cestas grande")
                }else {
                    cestasGrandes--
                    println("Cesta grande entregue com sucesso")
                }
            }
            else -> println("Opção inválida")
        }
    }

    fun verEstoque() {
        println("Há $cestasPequenas cestas pequenas no estoque")
        println("Há $cestasMedias cestas médias no estoque")
        println("Há $cestasGrandes cestas grandes no estoque")
    }

    fun addClientes (cliente: Cliente) {
        qntClientes.add(cliente)
        println("Você foi cadastrado no sistema")
    }


    fun removeCliente(cliente: Cliente) {
        qntClientes.remove(cliente)
    }

    fun mostraClientes() {
        println("Temos ${qntClientes.size} clientes:")
        qntClientes.forEach {
            println(it)
        }
    }

    fun nClientes(): Int{
        return qntClientes.size

    }


}