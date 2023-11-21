fun main(args: Array<String>) {
    var resultadosSoma = somar(1, 15);
    println("RESULTADO DA SOMA = $resultadosSoma");

    var resultadoDivisao = dividir(numero_3 = 1);
    println("RESULTADO DA DIVISÃO = $resultadoDivisao");

}

fun somar(numero_1: Int, numero_3: Int): Int {
    return numero_1 + numero_3;
}

fun dividir(numero_1: Int = 2, numero_3: Int) = numero_1 / numero_3;
