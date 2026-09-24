package Aula_01;


public class Veiculo {

	//atributos ou variaveis globais
		//o que tenho??
		String modelo;
		String cor;
		int capacidade; //variavel global 
		String tipo; //variavel global
		int velocidade;	//variavel global
		//boolean -> falso ou verdadeiro
		boolean ligado;
		boolean desligado;
		
		//o que faço??
		public void acelerar() throws InterruptedException { 
			int cont=0;	//variavel local
			
			if(ligado == true) {
	
				while(cont <= 120) {
					System.out.println("Acelerando");
					System.out.println(velocidade);
					Thread.sleep(1000);
					cont = cont+10;
					velocidade+=10;
					}
			}else {
				System.out.println("Não posso, estou desligado");
			}
		}
		
		public void parar() throws InterruptedException {
			int cont=0;	//variavel local
			
			if(ligado == true) {
	
				while(cont <= velocidade) {
					System.out.println("Parando");
					System.out.println(velocidade);
					Thread.sleep(1000);
					cont = cont-10;
					velocidade-=10;
					if(velocidade == 0) {
						System.out.println("carro parado");
						break;
					} 
					}
			}else {
				System.out.println("Não posso, estou desligado");
			}
		}
		
		public void ligar() {
			
		}
		
		public void desligar() {
			
		}
		
}
