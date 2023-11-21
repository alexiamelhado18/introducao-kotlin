fun main(args: Array<String>) {
    val numeros = arrayListOf<Int>();

    var tamanho = 0;

    do {
        numeros.add(tamanho++);
        println("Tamanho da lista : ${numeros.size}");

    } while (tamanho != 10)
}