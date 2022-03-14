import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

    internal class ClienteTest {
    val cliente = Cliente(0)
        @Test
        fun verLimite() {
            cliente.nCestas = 4
            assertTrue (cliente.verLimite())
        }
    val opc = 1
        @Test
        fun escolherCestaTest(){
            cliente.escolherCesta(opc)
            assertEquals(1, cliente.nCestas)
        }

    }