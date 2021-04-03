package one.digitalinnovation.collection

data class Funcionario(

    val nome: String,
    val salario: Double,
    val tipodecontratacao: String
)   {

    override fun toString(): String =
        """
        Nome: $nome
        Salário: $salario
      
    """.trimIndent()
}