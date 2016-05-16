import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class Main {

	public static void main(String[] args) {		
		String nome = lerString();
		Calculadora calc = new Calculadora(nome);

		boolean vaiParaProximo = true;

		Scanner leitor = new Scanner(System.in);
		
		while (vaiParaProximo) {
			System.out.println("Qual opera��o voc� quer realizar?\n "
					+ "1-somar;\n 2-subtrair;");
			int operacao = leitor.nextInt();
			double valor1, valor2;
			
			switch (operacao) {
			case 1:
				valor1 = lerDouble();
				valor2 = lerDouble();

				imprime("soma", calc.somar(valor1, valor2));
				break;

			case 2:
				valor1 = lerDouble();
				valor2 = lerDouble();

				imprime("subtrair", calc.subtrair(valor1, valor2));
				break;

			default:
				System.out.println("Opera��o inv�lida! Tente novamente!");
				break;
			}

			System.out.println("Voc� quer realizar outra opera��o? [s|n]");
			String continua = leitor.next();

			if (!continua.equals("s")) {
				vaiParaProximo = false;
			}
		}
		
		System.out.println("Obrigado, " + nome);
	}

	public static void imprime(String nomeOper, double resultado) {
		System.out.println("O resultado da " + nomeOper + " foi: " + resultado);
	}
	
	public static String lerString(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		return leitor.next();
	}
	
	public static double lerDouble(){
		boolean naoEDouble = true;
		double valor = 0;
		while (naoEDouble) {
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o valor: ");
			try {
				valor = leitor.nextDouble();
				naoEDouble = false;
			} catch (Exception e) {
				System.out.println("Double n�o � v�lido!");
			}
		}
		return valor;
	}

}
