fun main() {
    print("Digite o primeiro número: ")
    val num = readLine()!!.toDouble()
    print("Digite o segundo número: ")
    val num2 = readLine()!!.toDouble()
    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toDouble()


    if (num <= num2 && num <= num3 && num2 <= num3) {
        println("A ordem dos números é: $num ,$num2, $num3")
    } else if(num <= num3 && num <= num2 && num3 <= num2) {
        println("A ordem dos números é: $num, $num3, $num2")
    }else if(num2 <= num && num2 <= num3 && num <= num3) {
        println("A ordem dos números é: $num2, $num, $num3")
    }else if(num2 <= num3 && num2 <= num && num3 <= num) {
        println("A ordem dos números é: $num2, $num3, $num")
    }else if(num3 <= num && num3 <= num2 && num <= num2) {
        println("A ordem dos números é: $num3, $num, $num2")
    }else{
        println("A ordem dos números é:$num3, $num2, $num ")
    }

}