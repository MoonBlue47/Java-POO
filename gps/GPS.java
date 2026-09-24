package GPS;

public class GPS {
    private String idioma;
    private String rota;

    public GPS() {
    }

    public GPS(String idioma, String rota) {
        this.idioma = idioma;
        this.rota = rota;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String novoIdioma) {
        this.idioma = novoIdioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String novaRota) {
        this.rota = novaRota;
    }

    public void mostrar() {
        System.out.println("--- Dados do GPS ---");
        System.out.println("Idioma: " + idioma);
        System.out.println("Rota: " + rota);
        System.out.println("--------------------");
    }
}