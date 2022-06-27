package one.digitalinnovation.digionebanck

class Pessoas {
    var nome: String = "Marcelo Pimenta"
    var cpf: String = "123.123.123.12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val nomepessoa = Pessoas()

    println(nomepessoa.pessoaInfo())
    //println(nomepessoa)
    //println(nomepessoa.nome)
    //println(nomepessoa.cpf)
}