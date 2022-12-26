
class PilhaMutavel<E>(vararg items: E){                                  //1. Declarou uma classe genérica através do "<E>", que recebe uma lista de "E" como parâmetro.
    private val elementos = items.toMutableList()                        //2. Declara uma váriavel privada "Elementos" que recebe os elementos "E" e converte para uma lista mutável.
    fun push(element: E) = elementos.add(element)                        //3. Adiciona um elemento na variável elementos.
    fun peek(): E = elementos.last()                                     //4. Pega o último elemento da lista "elementos" sem o removê-lo
    fun pop(): E = elementos.removeAt(elementos.size - 1)          //5. Pega o útimo elemento da lista "elementos" e o remove.
    fun isEmpty() = elementos.isEmpty()                                  //6. Verifica se a lista "Elementos" está vazia.
    fun size() = elementos.size                                          //7. Calcula o tamanho da lista Elementos.
    override fun toString() = "Introdução.PilhaMutavel(${elementos.joinToString()})"//8. Método para converter a pilha para texto para ser fácil de enxergar no console.
}
fun <E> mutableStackOf(vararg elements: E) = PilhaMutavel(*elements)

fun main(){
    println("-------Exemplo da funções push(), peek() e pop() com números reais--------")

    val pilha = PilhaMutavel(0.62, 3.14, 2.7)
    pilha.push(9.87)
    println(pilha)

    println("peek(): ${pilha.peek()}")
    println(pilha)

    for (i in 1..pilha.size()){
        println("pop(): ${pilha.pop()}")
        println(pilha)
    }

    println("-------Exemplo da funções peek() e pop() com string--------")

    val pilha1 = PilhaMutavel("A", "B", "C", "D")

    println("peek(): ${pilha1.peek()}")
    println(pilha1)

    for (i in 1..pilha1.size()){
        println("pop(): ${pilha1.pop()}")
        println(pilha1)
    }
    val pilha2= PilhaMutavel(1)

    println("-------Textando a função isEmpty() e size()--------")
    println("pilha1:")
    if(pilha1.isEmpty()){
        println("isEmpty(): Vazio")
    } else {
        println("size(): ${pilha1.size()}")
    }
    println("pilha2:")
    if(pilha2.isEmpty()){
        println("isEmpty(): Vazio")
    } else {
        println("size(): ${pilha2.size()}")
    }
    println("Testando a função genérica")
    val pilha3 = mutableStackOf(0.62, 3.14, 2.7)
    println(pilha3)
}