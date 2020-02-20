import javax.swing.JOptionPane


fun main(args: Array<String>){

    //pede nome do usuário
    val nome = JOptionPane.showInputDialog("Digite seu nome:")
    //formata a mensagem de saida
    val saida = String.format("%s %s", "Bem-Vindo,", nome)
    //apresenta o texto em interface grafica
    JOptionPane.showMessageDialog(null, saida)
}