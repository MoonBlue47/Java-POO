package Planeta;

public class Planeta {

    public static void main(String[] args) {
        // Animal Marinho
        AniMarinho mar = new AniMarinho();
        System.out.println("--- Marinho ---");
        mar.setEspecie("Golfinho");
        mar.setTipo("Marinho");
        mar.setTamanho("7m");
        mar.setPeso("5 toneladas");
        System.out.println("Tipo: " + mar.getTipo());
        System.out.println("Espécie: " + mar.getEspecie());
        System.out.println("Tamanho: " + mar.getTamanho());
        System.out.println("Peso: " + mar.getPeso());

        // Animal Terrestre
        AniTerrestres terra = new AniTerrestres();
        System.out.println("\n--- Terrestre ---");
        terra.setEspecie("Cachorro");
        terra.setTipo("Terrestre");
        terra.setTamanho("1m");
        terra.setPeso("20kg");
        System.out.println("Tipo: " + terra.getTipo());
        System.out.println("Espécie: " + terra.getEspecie());
        System.out.println("Tamanho: " + terra.getTamanho());
        System.out.println("Peso: " + terra.getPeso());

        // Animal Voador
        AniVoador ar = new AniVoador();
        System.out.println("\n--- Voador ---");
        ar.setEspecie("Papagaio");
        ar.setTipo("Voador");
        ar.setTamanho("35cm");
        ar.setPeso("400g");
        System.out.println("Tipo: " + ar.getTipo());
        System.out.println("Espécie: " + ar.getEspecie());
        System.out.println("Tamanho: " + ar.getTamanho());
        System.out.println("Peso: " + ar.getPeso());
    }
}