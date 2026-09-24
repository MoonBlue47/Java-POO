package Aula_24;

public class Polimorfismo_02 {
	static class Calculadora{
		int somar(int a, int b) {
			return a+b;
		}
		double somar(double a, double b) {
			return a+b;
		}
		int somar(int a, int b, int c) {
			return a+b+c;
		}
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.somar(2,3));
		System.out.println(calc.somar(4.3,3.6));
		System.out.println(calc.somar(1,2,3));
	}
}
