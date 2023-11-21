fun main(args: Array<String>) {

    val char: Char = 'M';
    val int: Int = 0;
    val float: Float = 0.0F;
    val string: String = "texto";
    val double: Double = 2000.00;
    val long: Long = 10_000_000_000_000L;

    //char para string
    println("Char convertida para String: ${char.toString()}");

    //string para char
    println("String convertida para Char ${string.toCharArray()}");

    //int para float
    println("Int convertido para Float ${int.toFloat()}");

    //float para int
    println("Float convertido para Int ${float.toInt()}");

    //double para long
    println("Double convertido para Long ${double.toLong()}");

    //long para double
    println("Long convertido para Double ${long.toDouble()}");

}