public abstract class Pessoa {
    private String nome;
    private String Telefone;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        Telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}