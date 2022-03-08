import classes.*

val cavalo = Cavalo("", 0)
val cachorro = Cachorro("", 0)
val preguica = Preguica("", 0)
fun main() {
    menu()
}

fun menu() {
    println(
        "Digite '1' para o cavalo" +
                "\nDigite '2' para o cachorro" +
                "\nDigite '3' para a preguiça"
    )
    when (readLine()!!.toInt()) {
        1 -> {
            cavalo.selecionarNome()
            cavalo.digitarIdade()
            cavalo.mostrarDados()
            cavalo.somAnimal()
            cavalo.correr()
        }
        2 ->{
            cachorro.selecionarNome()
            cachorro.digitarIdade()
            cachorro.mostrarDados()
            cachorro.somAnimal()
            cachorro.correr()
        }
        3 ->{
            preguica.selecionarNome()
            preguica.digitarIdade()
            preguica.mostrarDados()
            preguica.somAnimal()
            preguica.subirEmArvore()
        }
    }
}
