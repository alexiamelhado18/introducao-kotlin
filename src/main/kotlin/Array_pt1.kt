import java.util.*

fun main(args: Array<String>) {
    val paises = arrayOf("Angola", "Brasil", "EUA", "Chile");

    //acessar elementos
    println(paises[1]);

    //tamanho de itens da lista paises
    println(paises.count());

    //ordena
    //paises.sortBy { it.length > 3}
    //println(paises);

    //mostra o indice de um possivel pais
    println(Arrays.binarySearch(paises, "Chile"));
}