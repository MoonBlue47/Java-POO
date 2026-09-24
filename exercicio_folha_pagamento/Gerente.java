package Exercicio_2;

public class Gerente extends Funcionario implements Bonificavel{

	public Gerente(String nome, double salarioBase) {
		super(nome, salarioBase);
	}

	@Override
	public double calcularBonus() {
		return salarioBase+2000;
	}

	@Override
	public double calcularSalario() {
		return salarioBase*0.20;
	}

}
