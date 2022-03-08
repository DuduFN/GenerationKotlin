package classes

 class Cavalo  (override var nome: String, override var idade: Int): Animal {
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
        println("iiirrrrí")
    }

    fun correr() {
        println(
            "Se você quer que o cavalo corra, digite '1'" +
                    "\nse não quer que o cavlo corra digite '2'"
        )
        when (readLine()!!.toInt()) {
            1 -> println("O cavalo está correndo")
            2 -> println("O cavalo não está correndo")
        }
    }
}


