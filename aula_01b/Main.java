package Aula_01b;

public class Main {

	public static void main(String[] args) {
		Calculos calculadora = new Calculos();
		
		calculadora.somar(calculadora.retornar01(),
						  calculadora.retornar02());
		
		calculadora.subtrair(calculadora.retornar01(),
								calculadora.retornar02());
		
		calculadora.multiplicação(calculadora.retornar01(),
		  		  					calculadora.retornar02());
		
		calculadora.divisao(calculadora.retornar01(),
		  		  			calculadora.retornar02());
					
	}

}
