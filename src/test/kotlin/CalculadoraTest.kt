import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calculadora = Calculadora()

    @Test
    fun soma() {
        assertEquals(10, calculadora.soma(5,5))
    }

    @Test
    fun subtracao() {
        assertEquals(10, calculadora.subtracao(20,10) )
    }

    @Test
    fun multiplicacao() {
        assertEquals(10, calculadora.multiplicacao(5,2))
    }

    @Test
    fun divisao() {
        assertEquals(10, calculadora.divisao(100,10))
    }

    @Test
    fun potencia() {
        assertEquals(25.0, calculadora.potencia(5.0))
    }

    @Test
    fun raizQuadrada() {
        assertEquals(5.0, calculadora.raizQuadrada(25.0))
    }
}