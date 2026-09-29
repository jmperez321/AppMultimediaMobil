package Tasca2KitBasic.fase2

class Inventari {
    private val  lista : ArrayList<Producte> =  arrayListOf()
    fun registrar(){
        val p = Producte(0,"",0,0,"")
        lista.add(p)
    }

    fun getAllProducts(): ArrayList<Producte>{
        return lista
    }

    fun updateProduct(id: Int, Stock: Int){
        lista.get(id).stock

    }

}