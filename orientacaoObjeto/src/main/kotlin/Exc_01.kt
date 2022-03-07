fun main() {
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta
 classe, em seguida crie um objeto cliente, defina as instancias deste objeto e
 apresente as informações deste objeto no console.
 */
    val cli = Cliente()

    println("Digite o nome do Cliente: ")
    val nome = readLine()!!
    cli.nome = nome

    println("Digite a idade do Cliente: ")
    val idade = readLine()!!.toInt()
    cli.idade = idade

    println("$nome, $idade")

    cli.pagmntCli("")
    cli.bonus(0.0)
}