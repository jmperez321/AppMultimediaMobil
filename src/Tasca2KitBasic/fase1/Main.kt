package Tasca2KitBasic.fase1

fun main() {
    // FASE 1-1
    println("\n** FASE 1-1 ** ")
    val text = "melon"
    printText(text)
    printText(null)
    printText("pepe")

    //FASE 1-2
    println("\n** FASE 1-2 ** ")
    val a = 55f
    val descuento = 13f


    println("Precio con descuento: " + calcularDescuento(a,descuento))

}
    // FASE 1-1
    fun printText(text:String?) {
    println(text?:"No texto")

}
    // FASE 1-2
    fun calcularDescuento(pbruto : Float, descuento : Float ): Float {
        return (100-descuento)/100 * pbruto
    }

