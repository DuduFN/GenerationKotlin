package classes

class Cachorro (override var nome: String, override var idade: Int): Animal {
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
        println("AUAUAUAU" +
                "\nAUAUAUAU" +
                "\nAUAUAUAU")
    }
    fun correr(){
        println("Se você quer que o cachorro corra, digite '1'" +
                "\nse não quer que o cachorro corra digite '2'")
        when(readLine()!!.toInt()){
            1 -> println("O cachorro está correndo")
            2 -> println("O cachorro não está correndo")
        }
    }
}