 package Aula_24;

public class Polimorfismo_01 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.emitirSom();

	}

}


//-----------Classes de apoio--------------

class Animal{
	void emitirSom() {
		System.out.println("Som generico de animal");
	}
}

class Cachorro extends Animal{
	@Override
	public void emitirSom() {
		System.out.println("au au");
	}
}

class Gato extends Animal{
	@Override
	public void emitirSom() {
		System.out.println("miau");
	}
}