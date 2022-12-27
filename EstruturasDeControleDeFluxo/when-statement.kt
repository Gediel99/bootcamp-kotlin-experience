/*
    O When pode ser usado no lugar de estruturas de switch, são mais limpas e flexíveis.
    Elas podem ser usadas como uma declaração ou como uma expressão.
*/
fun main(){
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}
fun cases(obj: Any){                                                //1. Declara uma função "cases" que recebe Any (algo que recebe qualquer coisa) de parâmetro;
    when (obj) {                                                    //2. Quando o obj for tal caso, ele imprimirá.
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass