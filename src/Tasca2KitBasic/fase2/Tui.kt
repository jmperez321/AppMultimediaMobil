package Tasca2KitBasic.fase2

class Tui {
    fun printBackToMainMenu(){
        println("\nVolviendo al menú principal...")
    }
    fun printCloseApp(){
        println("Cerrando aplicación...")
    }
    fun printMainMenu() {
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
    }
    fun printUptMenu(){
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
    }
    fun printLectIDText(){
        println("\nEscribe el ID del producto objetivo.")
    }
    fun printLectStock(){
        println("\nEscribe el Stock del producto objetivo.")
    }
    fun printLectPrize(){
        println("\nEscribe el PRECIO.")
    }
    fun printLectName(){
        println("\nEscribe el NOMBRE.")
    }
    fun printLectCat(){
    println("\nEscribe la CATEGORIA.")
    }
    fun printErrorOp() {
        println("Opción no valida.")
    }
}