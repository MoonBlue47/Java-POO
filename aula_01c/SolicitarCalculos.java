package Aula_01c;

import java.util.Scanner;

public class SolicitarCalculos {
	Calculos calc = new Calculos();
	
	void calcular() {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("digite a operação:");
		String op = scr.next();
		
		switch (op) {
		case "+":
			calc.somar(calc.retornar01(), calc.retornar02());
			break;
			
		case "-":
			calc.subtrair(calc.retornar01(), calc.retornar02());
			break;
			
		case "*":
			calc.multiplicar(calc.retornar01(), calc.retornar02());
			break;
		
		case "/":
			calc.dividir(calc.retornar01(), calc.retornar02());
			break;
		}
		scr.close();
	} 
}
