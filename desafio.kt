// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String, var email: String) {
    var nivel = Nivel.BASICO
    var formacoes = mutableListOf<Formacao>()

    fun adicionarFormacao(formacao: Formacao) {
        formacoes.add(formacao)
    }

    fun exibirFormacoes() {
        formacoes.forEach { println(it.nome) }
    }

    fun matricular(formacao: Formacao) {
        formacao.matricular(this)
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val usuario = Usuario("Edson", "edsonrafael756@gmail.com")
    usuario.nivel = Nivel.INTERMEDIARIO
    usuario.adicionarFormacao(Formacao("Kotlin", listOf(ConteudoEducacional("Introdução ao Kotlin"), ConteudoEducacional("Classes e Objetos"))))


    usuario.exibirFormacoes()
}
