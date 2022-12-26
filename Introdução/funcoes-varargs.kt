package Introdução

fun main () {
    fun imprimir (vararg mensagens: String) {               //inicia o parâmetro da função com o vararg, sendo assim poderá inserir vários valores.
        for (m in mensagens) println(m );
    }
    imprimir("Um", "dois","três", "quatro", "cinco");

    fun imprimirComPrefixo (vararg mensagens: String, prefixo: String) {
        for (m in mensagens) println(prefixo + m);
    }
    imprimirComPrefixo("Olá", "Testando", "Maravilhoso", prefixo = "[Info] ")

    fun log (vararg entries: String) {
        imprimir(*entries);
    }

    //Variáveis mutáveis e imutáveis

    var d: Int = 10
    d = 12
    println(d)

    val e: Int = 10                                          //{e = 12}  é impossivel alterar o valor da variável, já que foi criada com o val.
    println(e)
}
