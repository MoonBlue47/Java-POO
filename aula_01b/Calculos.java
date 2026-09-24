package Aula_01b;

import java.util.Scanner;

public class Calculos {
	//variaveis global
		double num01;
		double num02;
		double total;
		
		double retornar01() {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um valor: ");
			num01 = ler.nextDouble();
			return num01;
		} 
		double retornar02() {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite outro valor: ");
			num02 = ler.nextDouble();
			return num02;
		}
		
		void somar(double a, double b) {
			num01 = a;
			num02 = b;
			total = num01+num02;
			System.out.println("total da soma: "+total);
			System.out.println("\n==================================");
		}
		
		void subtrair(double a, double b) {
			num01 = a;
			num02 = b;
			total = num01-num02;
			System.out.println("total da subtração: "+total);
			System.out.println("\n==================================");
		}

		void multiplicação(double a, double b) {
			num01 = a;
			num02 = b;
			total = num01*num02;
			System.out.println("total da multiplicação: "+total);
			System.out.println("\n==================================");
		}
		//=======================================================//
		void divisao(double a, double b) {
			num01 = a;
			num02 = b;
			total = num01/num02;
			System.out.println("total da divisão: "+total);
			System.out.println("\n==================================");
		}
}
