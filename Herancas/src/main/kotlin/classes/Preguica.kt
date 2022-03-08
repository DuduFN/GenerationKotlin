package classes

class Preguica (override var nome: String, override var idade: Int): Animal {
    fun selecionarNome(){
        println("Qual o nome do cavalo?")
        val nome = readLine()!!
        if (nome.isEmpty()){
            println("Nome invalido")
        }
    }
    fun digitarIdade() {
        println("Qual a idade do cavalo?")
        val idade = readLine()!!
        if (idade.isEmpty()) {
            println("Nome invalido")
        }
    }
    fun mostrarDados(){
        println("$nome, $idade")
    }
    override fun somAnimal() {
        println("")
    }
    fun subirEmArvore(){
        println("Se você quer que a preguiça suba na arvore, digite '1'" +
                "\nse não quer que a preguiça suba na arvore digite '2'")
        when(readLine()!!.toInt()){
            1 -> println("A preguiça está na arvore ")
            2 -> println("A preguiça não está na arvore")
        }
    }
}