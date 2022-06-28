package one.digitalinnovation.digionebanck.teste

import one.digitalinnovation.digionebanck.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    //digiOneBank.nome = "Teste123"
    //println(digiOneBank.nome)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.info())
    //println(banco2.numero)
}