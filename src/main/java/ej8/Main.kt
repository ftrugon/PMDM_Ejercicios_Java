package ej8

fun main() {
    val goku = Personaje("Goku",100,20)
    val vegeta = Personaje("Vegeta",80,25)
    while (goku.vida > 0 && vegeta.vida > 0){
        goku.vida -= vegeta.ataque
        vegeta.vida -= goku.ataque

        println("Vida de goku: ${goku.vida}")
        println("Vida de vegeta: ${vegeta.vida}")

        if (goku.vida <= 0){
            println("Vegeta ha ganado el combate")
        }else if (vegeta.vida <= 0) println("Goku ha ganado el combate")

    }

}

class Personaje(val nombre: String,var vida: Int, var ataque: Int)