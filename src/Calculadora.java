

//Aqui abaixo foi Criada a Classe Calculadora

public class Calculadora {
	
	private String proprietario;
	
	public Calculadora(String nome){
		proprietario = nome;
	}
	
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	
}
