package Introdução

fun imprimir(mensagem: String): Unit {                                   //1. Use fun para criar uma função e defina sempre a entrada para ela (String, Int, float...)
    println(mensagem);                                                   //2. Ao definir o nome da variável que vai receber uma string, use o nome para aplicar as operações.
}

fun imprimirComPrefixo (mensagem: String, prefixo: String = "Info") {    //3. Ao utilizar o [= "Info"] no prefixo, enquanto não receber um valor em sua variável terá como padrão Info no lugar.
    println("[$prefixo] $mensagem");                                     //4. Utilizando $NomeDaVariável, pode contactenar variáveis de maneira simples.
}

fun soma(x: Int, y: Int): Int {                                          //5. Exemplo de Introdução.soma de Inteiros
    return x + y;                                                        //6. Utilizando o "return"
}

fun multiplica(x: Int, y: Int) = x * y;                                  //7. Exemplo de multiplicação de Inteiros, porém sem o "return" escrito.

fun main () {
    imprimir("Hello");
    imprimirComPrefixo("Hello", "Log");
    imprimirComPrefixo("Hello");
    imprimirComPrefixo(prefixo = "Log", mensagem = "Hello")
    println(soma(10, 20));
    println(multiplica(30, 50));
}