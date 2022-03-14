import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
internal class CalculadoraTest{
    @Test
    fun somaTest(){
        assertEquals(7.0, Calculadora.adicao(4.0,3.0))
}
    @Test
    fun subTest(){
        assertEquals(12.0, Calculadora.subtracao(20.0,8.0))
    }
    @Test
    fun multTest(){
        assertEquals(32.0, Calculadora.mult(8.0,4.0))
    }
    @Test
    fun divTest(){
        assertEquals(4.0, Calculadora.divisao(20.0,5.0))
    }
}


