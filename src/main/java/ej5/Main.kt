package ej5

fun main() {
    val gokuLeGana = Personaje("Goku",1000000,100000)
    gokuLeGana.mostrarInfo()
}

class Personaje(val nombre: String, val vida: Int, val ataque: Int){

    fun mostrarInfo(){
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}