package EstruturasDeControleDeFluxo
/*
    Esse caso diferencia do when statement, pois ele faz uma atribuição a uma variável e lá é uma instrução que executa no corpo.
*/

fun main(){
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val resultado = when (obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return resultado
}

class MyClass