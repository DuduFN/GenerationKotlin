import kotlin.math.*

fun main(){
    println("Digite o número desejado: ")
    val num = readLine()!!.toDouble()

    if(num % 2.0 == 0.0 ){
           val raiz = sqrt(num)
        println("Esse número é par e a raiz dele é = $raiz")
        }else {
            val quad = num.pow(2)
        println("Esse número é impar e ele elevado ao quadrado é = $quad")
        }
    }
