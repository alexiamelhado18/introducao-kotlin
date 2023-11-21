import javax.swing.JOptionPane

fun main(args: Array<String>) {
    //Pede o nome do usuário
    val nome =  JOptionPane.showInputDialog("Digite seu nome");

    //Formata a mensagem de saída
    val saida = String.format("%s %s", "BEM-VINDO(A) ", nome);

    //Apresenta o texto em uma interface gráfica
    JOptionPane.showMessageDialog(null, saida);

}