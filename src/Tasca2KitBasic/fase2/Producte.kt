package Tasca2KitBasic.fase2

class Producte(val ID: Int,val nom: String,var preu: Float,var stock: Int, val categoria: String) {
    // Crear una class per a l'entitat Producte, que contingui
    // identificador, nom, preu, stock i categoria.

    override fun toString(): String {
        return "$ID, $nom, $preu €,  $stock, $categoria"
    }

}