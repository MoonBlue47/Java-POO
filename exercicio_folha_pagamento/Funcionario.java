package Exercicio_2;

public abstract class Funcionario {
	
	protected String nome;
	protected double salarioBase;
	
	public Funcionario(String nome, double salarioBase) {
		this.nome = nome; this.salarioBase = salarioBase;
	}
	
	public abstract double calcularSalario();
	
	public void exibir() {
		System.out.printf("%s - Salario: R$ %.2f%n", nome, calcularSalario());
	}
	 

}
