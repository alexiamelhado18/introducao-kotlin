fun main (args: Array<String>){
    val numeros = arrayListOf<Int>();

    var tamanho = 0;

    while (tamanho != 10){
        numeros.add(tamanho++);

        println("Tamanho da lista : ${numeros.size}");

    }
}