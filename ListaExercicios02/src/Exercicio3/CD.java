package Exercicio3;

public class CD extends Item{
    private String artista;
    private int quantidadeDeFaixas;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantidadeDeFaixas() {
        return quantidadeDeFaixas;
    }

    public void setQuantidadeDeFaixas(int quantidadeDeFaixas) {
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    @Override
    public String toString() {
        return "CD: " +
                super.toString() +
                "artista: '" + artista + '\'' +
                ", quantidadeDeFaixas: " + quantidadeDeFaixas +
                "%n";
    }
}
