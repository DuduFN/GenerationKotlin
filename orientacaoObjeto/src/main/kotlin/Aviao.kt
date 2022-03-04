class Aviao {

    var combustivel = 0.0

    fun conferirCombustivel(valor: Double){
        if (combustivel <= 200000.0){
            println("O avião não pode decolar com esse combustivel")
        }else{
            println("Esse avião pode decolar com essa quantidade de combustivel")
        }
    }
}
