package Exercicio_2;

public class Main {
    public static void main(String[] args) {
        Funcionario[] equipe = {
            new Gerente("Carlos", 5000),
            new Vendedor("Ana", 2000, 30000)
        };

        for (Funcionario f : equipe) {
            f.exibir();
            if (f instanceof Bonificavel) {
                System.out.printf(" Bonus: R$ %.2f%n", ((Bonificavel) f).calcularBonus());
            }
        }
    }
}