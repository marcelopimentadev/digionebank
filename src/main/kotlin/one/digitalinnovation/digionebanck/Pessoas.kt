package one.digitalinnovation.digionebanck

class Pessoas {
    var nome: String = "Marcelo Pimenta"
    var cpf: String = "123.123.123.12"
    private set
}

fun main() {
    val nomepessoa = Pessoas()

    println(nomepessoa)
    println(nomepessoa.nome)
    println(nomepessoa.cpf)
}