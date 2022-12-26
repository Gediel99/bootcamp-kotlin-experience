package Introdução

fun main () {
    var neverNull: String = "Aqui nao pode ser nulo"        //1. Quando criamos uma variável assim, significa que não pode nulo.
    //neverNull = null                                      //2. Dará um erro "non-null type String"

    var nullable: String? = "Voce pode ter um nulo aqui"    //3. Porém se você utilizar o "?" depois de String, conseguirá aceitar um valor nulo.
    nullable = null                                         //4. Aqui não dará erro.

    var inferredNonNull = "O compilador assume non-null"    //5. Uma inferência definida como não nula.
    //inferredNonNull = null                                //6. Atribuindo um valor nulo a uma variável que aceita valores não nulos - Acontecerá um erro.

    fun strLength(notNull: String): Int {                   //7. Dessa maneira não aceita valores nulos.
        return notNull.length
    }

    fun strLength1(notNull: String?): Int {                 //8. Para funcionar, acrescente o "?" após o String.
        return notNull?.length ?: 0                         //9. E o retorno ficará assim: Caso não seja nulo "notNull?" caíra no 0 - "?: 0".
    }
    fun describeString(maybeString: String?): String {
        if(maybeString != null && maybeString.length > 0) {
            return "Tamanho da String: ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }
    println(strLength1(neverNull))
    println(strLength1(nullable))
    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}