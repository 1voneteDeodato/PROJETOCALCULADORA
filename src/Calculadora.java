
//CRIAÇÃO DA CLASS CALCULADORA

public class Calculadora {
	
	private String proprietario;
	
	public Calculadora(String nome){
		proprietario = nome;
	}
	
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	//executar a soma de dois valores e obter resultado.
	
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public int potencia(int valor1, int valor2) {
		int potencia = 1;
		for (int i = 0; i < valor2; i++) {
			potencia = potencia * valor1;
		}
		return potencia;
	}	

}
