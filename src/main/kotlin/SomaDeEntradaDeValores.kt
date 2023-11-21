fun main(args: Array<String>) {
    println("Sistema que soma 2 valores de entrada");

    println("Digite o primeiro valor: ");
    val valor_1 = readln()?.toInt()!!;

    println("Digite o segundo valor: ");
    val valor_2 = readln()?.toInt()!!;

    val soma = (valor_1 + valor_2);

    println("A soma dos valores 1 e 2 é: $soma");
}