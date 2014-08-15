import javax.swing.JOptionPane;


public class Exercicio_2 {

	public static void main(String[] args) {
		
		//aqui a variavel "nome" vai receber oq for digitado na janela do showInputDialog
		//metodo showInputDialog utiliza um agrumento, que é o texto a ser exibido
		String nome = JOptionPane.showInputDialog("Digite se nome");
		
		//aqui, depois da variavel ter recebido a informação, uma janela vai ser aberta 
		//com as informações do showMessageDialog.
		//metodo showMessageDialgo utiliza 4 argumentos:
		// o primiro é a dependencia de outras janelas, mas como não temos utiliza-se "null"
		// o segundo é o texto a ser exibido
		// o terceiro é o titulo da janela
		// o quarto representa o simbolo que vem antes do teste a ser exibido
		JOptionPane.showMessageDialog(null, nome + " Seja Bem Vindo a aula de Java com o "
				+ "Prof. Jefferson F. Barbosa", "Bem Vindo", JOptionPane.INFORMATION_MESSAGE);

	}

}
