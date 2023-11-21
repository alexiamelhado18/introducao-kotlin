fun main(args: Array<String>) {
    val cores = arrayListOf<String>();

    cores.add("Vermelho");
    cores.add("Amarelo");
    cores.add("Azul");
    cores.add("Branco");


    //remove o item Branco
    cores.remove("Branco");

    //tamanho da lista
    println(cores.size);

    //adiciona itens na lista cores
    cores.addAll(arrayOf("Cinza", "Magenta"));
    println(cores);

    //exibe o ultimo item da lista or
    println(cores[cores.size - 1]);
    println(cores.last());

}