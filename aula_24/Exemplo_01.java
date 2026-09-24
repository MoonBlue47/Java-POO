package Aula_24;

public class Exemplo_01 {
	public static void main(String[] args) {
		Animal1 tuiu = new Animal1();
		tuiu.emitirSom();
		Animal1 pintinho = new Pintinho();
		pintinho.emitirSom();
	}
}

class Animal1{
	void emitirSom() {
		System.out.println("generico");
	}
}
class Pintinho extends Animal1{
	@Override
	void emitirSom() {
		System.out.println("Piu piu");
	}
}