fun main(){
    var numP = 0
    var numI = 0

    for (i in 1..10){
        print("Digite o ${i}° número: ")
        val num = readLine()!!.toInt()

        if (num % 2 == 0){
            numP++
        }else{
            numI++
        }
    }
    println("A quantidade de números impares é: $numI")
    println("A quantidade de números pares é: $numP")
}