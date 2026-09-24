package Aula_24;

import java.util.ArrayList;
import java.util.List;

public class Exemplo_02 {
	static class Animal{
		void emitirSom() {
			System.out.println("generico");
		}
	}

	static class Cachorro extends Animal{
		@Override
		void emitirSom() {
			System.out.println("au au");
		}
	}
	
	static class Gato extends Animal{
		@Override
		void emitirSom() {
			System.out.println("miau miau");
		}
	}
	
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Animal());
		zoo.add(new Cachorro());
		zoo.add(new Gato());
		zoo.add(new Cachorro());
		for(Animal a: zoo)a.emitirSom();
		
	}
}