fun main(){
    val aviao = Aviao()

    println("Quanto de combustivel tem no avião ?")
    val querosene = readLine()!!.toDouble()
    aviao.combustivel = querosene
    aviao.conferirCombustivel(querosene)

}
