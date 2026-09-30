package Tasca2KitBasic.fase2

class Inventari {
    private val lista: ArrayList<Producte> = arrayListOf()
    var counterID:Int = 1
    fun registrar(pro: Producte) {
        lista.add(pro)
        this.counterID++
    }

    fun getAllProducts(): ArrayList<Producte> {
        return lista
    }

    fun updateStock(id: Int, stock: Int) {
        val prod = lista.first { it.ID == id }
        prod.stock = stock
    }
    fun updatePreu(id: Int, preu: Float) {
        val prod = lista.first { it.ID == id }
        prod.preu = preu
    }


}