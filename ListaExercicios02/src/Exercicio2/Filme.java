package Exercicio2;

public class Filme {

    //gênero, ano e autor principal
    private long codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autor;
    private static int totalFilmes = 0;

    public Filme(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        totalFilmes ++;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Filme: " + '\'' +
                "codigo: " + codigo +
                ", nome: '" + nome + '\'' +
                ", genero: " + getGenero() +
                ", ano: " + ano +
                ", autor: '" + autor + '\'';
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
