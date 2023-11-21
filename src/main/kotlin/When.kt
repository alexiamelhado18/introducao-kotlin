fun main(args: Array<String>) {
    val idade = 22;
    when (idade) {
        in 18..25 -> println("Jovem Adulto");
        in 26..35 -> println("Adulto");
        else -> {
            println("Idoso");
        }
    }
}