package Tasca2KitBasic.fase2

fun main() {
    val iv = Inventari()
    var encendido: Boolean = true
    var op: Int = 0
    val t = Tui()

    while (encendido) {
        op = menuAcciones(t)
        when (op) {
            1 -> {
                val pro = Producte(iv.counterID, lectNombre(t),lectPreu(t),lectStock(t),lectCategory(t))
                iv.registrar(pro)}
            2 -> {
                for (x in iv.getAllProducts()){
                    println(x.toString())
                }
            }

            3 -> {
                var encendido2: Boolean = true
                while (encendido2) {
                    val nUpdt = menuAccUpdate(t)

                    when (nUpdt) {
                        1 -> {
                            var imputID = lectID(t)
                            iv.updatePreu(imputID, lectPreu(t))
                        }

                        2 -> {
                            var imputID = lectID(t)
                            iv.updateStock(imputID, lectStock(t))
                        }

                        3 -> {
                            t.printBackToMainMenu()
                            encendido2 = false
                        }

                        else -> t.printErrorOp()
                    }
                }
            }

            4 ->{
                t.printCloseApp()
                encendido = false}
            else -> t.printErrorOp()

        }

    }

}

fun menuAcciones(t: Tui): Int {
    t.printMainMenu()
    var op2: String = readln()
    return op2.toInt()
}

fun menuAccUpdate(t: Tui): Int {
    t.printUptMenu()
    var op3: String = readln()
    return op3.toInt()
}

fun lectID(t: Tui): Int {
    t.printLectIDText()
    var imputID: String = readln()
    return imputID.toInt()
}

fun lectPreu(t: Tui): Float {
    t.printLectPrize()
    var imputPreu: Float = readln().toFloat()
    return imputPreu
}

fun lectStock(t: Tui): Int {
    t.printLectStock()
    var imputStock: String = readln()
    return imputStock.toInt()
}
fun lectNombre(t: Tui): String {
    t.printLectName()
    var imputNombre: String = readln()
    return imputNombre
}

fun lectCategory(t: Tui): String {
    t.printLectCat()
    var imputCategory: String = readln()
    return imputCategory
}

