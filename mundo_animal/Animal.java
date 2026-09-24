package MundoAnimal;

public class Animal {

	private String nome;
	private String especie;
	private String cor;
	private int idade;
	private double peso;
	
	public void comer() {
		System.out.println(nome + "está se alimentando.");
	}
	
	public void dormir() {
		System.out.println(nome + "está dormindo.");
	}
	
	public void mover() {
		System.out.println(nome + "está se movendo.");
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+nome+" | Espécie: "+especie+" | Cor: "+cor+" | Idade: "+idade+" anos | Peso: "+peso+ " kg");
	}
}
