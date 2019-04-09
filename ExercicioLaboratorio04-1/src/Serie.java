public class Serie extends ProgramaTV {

    private int quantTemporadas;
    private int quantEpisodios;

    public Serie(String nome, String categoria, int quantTemporadas, int quantEpisodios) {
        super(nome, categoria);
        this.quantTemporadas = quantTemporadas;
        this.quantEpisodios = quantEpisodios;
    }

    public int getQuantTemporadas() {
        return quantTemporadas;
    }

    public void setQuantTemporadas(int quantTemporadas) {
        this.quantTemporadas = quantTemporadas;
    }

    public int getQuantEpisodios() {
        return quantEpisodios;
    }

    public void setQuantEpisodios(int quantEpisodios) {
        this.quantEpisodios = quantEpisodios;
    }

    @Override
    public String toString() {
        String programa = codigo + "-" + nome + " (" + categoria + ")\n";
        programa = programa + "Diretor : " + diretor +"\n";
        programa = programa + "Quantidade de Temporadas: " + quantTemporadas + "\n";
        programa = programa + "Quantidade de Episodios: " + quantEpisodios + "\n";
        programa = programa + "Artistas : \n";
        for (int i=0;i<artistas.size();i++) {
            programa = programa + artistas.get(i) + "\n";
        }
        return programa;
    }
}
