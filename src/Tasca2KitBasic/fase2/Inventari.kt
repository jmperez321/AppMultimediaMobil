package Tasca2KitBasic.fase2

class Inventari {
    private val lista: ArrayList<Producte> = arrayListOf()
    private var counterID:Int = 1
    fun registrar() {
        val p = Producte(counterID, "", 0, 0, "")
        lista.add(p)
        this.counterID++
    }

    fun getAllProducts(): ArrayList<Producte> {
        return lista
    }

    fun updateStock(id: Int, stock: Int) {
        val prod = lista.first { it.ID == id }
        prod.stock = stock
    }
    fun updatePreu(id: Int, preu: Int) {
        val prod = lista.first { it.ID == id }
        prod.stock = preu
    }

}