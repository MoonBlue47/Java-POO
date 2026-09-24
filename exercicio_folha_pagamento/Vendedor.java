package Exercicio_2;

public class Vendedor extends Funcionario implements Bonificavel{

	private double vendas;

	public Vendedor(String nome, double salarioBase, double vendas) {
		super(nome, salarioBase); this.vendas = vendas;
}
	@Override
	public double calcularBonus() {
		return salarioBase*0.10;
	}

	@Override
	public double calcularSalario() {
		return salarioBase+vendas*0.05;
	}
}