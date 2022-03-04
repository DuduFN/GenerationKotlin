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


    println("Digite quanto tempo o $nome é cliente da empresa: ")
    val tempo = readLine()!!.toDouble()
    cli.tempoCliente = tempo
    cli.bonus(tempo)

    println("Digite o pagamento está em dia: ")
    val pgmnt = readLine()!!
    cli.pagmntEmDia = pgmnt
    cli.pagmntCli(pgmnt)
}