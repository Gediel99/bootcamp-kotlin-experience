class Cliente                                              //1. Declara uma classe nomeada "Cliente" sem parâmetro.
class Contato(val id: Int, var email: String)              //2. Declara uma classe nomeada "Contato" que recebe um parâmetro imutável do tipo Int e outro mutável do tipo String.
fun main(){
    val cliente = Cliente()                                //3. Declara uma variável que chama a classe "Cliente", porém é apenas uma exemplificação de como chamar uma classe.
    val contato = Contato(1, "mary@gmail.com")    //4. Declara uma variável que chama a classe "Contato", porém é apenas uma exemplificação de como chamar uma classe com parâmetro.
    println(contato.id)                                    //5. Maneira de imprimir especificamente parte da atribuição da classe.
    println(contato.email)
    contato.email = "jane@gmail.com"                       //6. Maneira de atribuir valor a uma variável mutável da classe chamada, independente se a variável declarada que a chamou é imutável ou não.
    println(contato.email)                                 //8. Testando para verificar se mudou realmente ou não.
}