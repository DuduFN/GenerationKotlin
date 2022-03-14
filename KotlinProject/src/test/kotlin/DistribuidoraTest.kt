import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class DistribuidoraTest {

    val distribuidora = Distribuidora()
    val cliente1 = Cliente(0)
    val cliente2 = Cliente(1)

    @BeforeEach
    fun add(){
        distribuidora.addClientes(cliente1)
        distribuidora.addClientes(cliente2)
    }


    @Test
    fun removeCliente() {
        distribuidora.removeCliente(cliente2)
        assertEquals(1, distribuidora.nClientes())
        distribuidora.removeCliente(cliente1)
        assertEquals(0, distribuidora.nClientes())
    }

    @Test
    fun addClientes(){
        assertEquals(2, distribuidora.nClientes())
    }
}


