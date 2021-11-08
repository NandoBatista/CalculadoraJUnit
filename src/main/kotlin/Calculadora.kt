import kotlin.math.*

class Calculadora {
    val raizQ = 25.0
    val potencia = 5.0

    fun soma(num1: Int, num2: Int): Int{
        return num1 + num2
    }
    fun subtracao(num1: Int, num2: Int): Int{
        return num1 - num2
    }
    fun multiplicacao(num1: Int, num2: Int): Int{
        return num1 * num2
    }
    fun divisao(num1: Int, num2: Int): Int{
        return num1 / num2
    }
    fun potencia(potencia: Double): Double{
        return potencia.pow(2)
    }
    fun raizQuadrada(raizQ: Double): Double {
       return sqrt(raizQ)
    }
}