public class RevistaVeja extends Revista{

    private String nome;
    private String edicao;

    public RevistaVeja() {
    }

    public RevistaVeja(String nome, String edicao) {
        this.setNome(nome);
        this.setEdicao(edicao);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.notificaAssinantes();
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
        this.notificaAssinantes();
    }
}
