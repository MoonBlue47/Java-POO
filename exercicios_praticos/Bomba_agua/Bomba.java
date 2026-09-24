package Bomba_agua;

public class Bomba {
    boolean status;
    
    public void ligar(int tempo) throws InterruptedException {
        status = true;
        System.out.println("Bomba ligada!");

        int cont = tempo; 
        
        while (cont > 0) {
            System.out.println("Faltam "+cont);
            Thread.sleep(1000); 
            cont = cont - 1;   
        }
        desligar();
    }
    public void desligar() {
        status = false;
        System.out.println("Bomba desligada");
    }
}