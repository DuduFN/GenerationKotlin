fun main(){
    println("Digite o primeiro número: ")
    val num = readLine()!!.toInt()
    println("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()
    println("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()


    var maior = num3

    if(num > maior) {
        maior = num

    }else if (num2 > maior) {
        maior = num2
    }
    else{maior=num3}

    println("O maior número digitado foi o : $maior")
}