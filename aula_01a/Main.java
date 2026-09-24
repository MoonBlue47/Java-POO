package Aula_01;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Veiculo argo = new Veiculo();
		
		argo.modelo = "Argo";
		argo.cor = "Azul";
		argo.capacidade = 5;
		argo.tipo = "popular";
		argo.ligado = true;
		argo.desligado = false;
		
		argo.acelerar();
		argo.parar();

	}

}
