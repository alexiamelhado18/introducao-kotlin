fun main(args: Array<String>) {
    //
    val carro1 = Carro();

    carro1.cor = "Azul";
    println(carro1.cor);
    carro1.abrirPorta();
}

class Carro {

    //Atributo
    var cor: String = "";

    fun abrirPorta() {
        println("Abrir porta do carro");
    }

}