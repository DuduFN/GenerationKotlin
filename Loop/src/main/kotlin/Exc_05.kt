fun main(){
    var num = 0
    var soma = 0
    do{
        println("Digite o número desejado: ")
        num = readLine()!!.toInt()
        soma += num
    }while(num!=0)
    println("A soma dos números foi: $soma")
}
