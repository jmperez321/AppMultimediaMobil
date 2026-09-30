package Tasca2KitBasic.fase2

fun main() {
    val iv = Inventari()
    var encendido: Boolean = true
    var op: Int = 0

    while (encendido) {
        op = menuAcciones()
        when (op) {
            1 -> {
                val pro = Producte(iv.counterID, lectNombre(),lectPreu(),lectStock(),lectCategory())
                iv.registrar(pro)}
            2 -> {
                //val prod = iv.getAllProducts()
                for (x in iv.getAllProducts()){
                    println(x.toString())
                }
            }

            3 -> {
                var encendido2: Boolean = true
                while (encendido2) {
                    val nUpdt = menuAccUpdate()

                    when (nUpdt) {
                        1 -> {
                            var imputID = lectID()
                            iv.updatePreu(imputID, lectPreu())
                        }

                        2 -> {
                            var imputID = lectID()
                            iv.updateStock(imputID, lectStock())
                        }

                        3 -> { println("\nVolviendo al menú principal...")
                            encendido2 = false
                        }

                        else -> errorOp()
                    }
                }
            }

            4 ->{println("Cerrando aplicación...")
                encendido = false}
            else -> errorOp()

        }

    }

}

fun menuAcciones(): Int {
    println(
        """ 
        | 
        | Selecciona el número la acción deseada: 
        | 1. Crear nuevo producto.
        | 2. Ver.
        | 3. Actualizar.
        | 4. Salir
        | 
    """.trimMargin()
    )
    var op2: String = readln()
    return op2.toInt()
}

fun menuAccUpdate(): Int {
    println(
        """ 
        | 
        | Selecciona el número la actualización deseada: 
        | 1. Precio.
        | 2. Stock.
        | 3. Salir.
        | 
    """.trimMargin()
    )
    var op3: String = readln()
    return op3.toInt()
}

fun lectID(): Int {
    println("\nEscribe el ID del producto objetivo.")
    var imputID: String = readln()
    return imputID.toInt()
}

fun lectPreu(): Float {
    println("\nEscribe el PRECIO.")
    var imputPreu: Float = readln().toFloat()
    return imputPreu
}

fun lectStock(): Int {
    println("\nEscribe el STOCK.")
    var imputStock: String = readln()
    return imputStock.toInt()
}
fun lectNombre(): String {
    println("\nEscribe el NOMBRE.")
    var imputNombre: String = readln()
    return imputNombre
}

fun lectCategory(): String {
    println("\nEscribe la CATEGORIA.")
    var imputCategory: String = readln()
    return imputCategory
}

fun errorOp() {
    println("Opción no valida.")
}