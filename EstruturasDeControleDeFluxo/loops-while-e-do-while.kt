package EstruturasDeControleDeFluxo

fun comerUmBolo() = println("Comeu um bolo")
fun fazerUmBolo() = println("Fez um bolo")

fun main(){
    var bolosComidos = 0
    var bolosFeitos = 0

    while (bolosComidos < 5){
        comerUmBolo()
        bolosComidos ++
    }

    do {
        fazerUmBolo()
        bolosFeitos ++
    } while (bolosFeitos < bolosComidos)
}