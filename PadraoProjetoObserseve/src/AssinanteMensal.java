public class AssinanteMensal implements Assinante {

    private String nome;

    public AssinanteMensal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void update() {
        System.out.println("O assinante Mensal " + nome + " foi notificado");
    }
}
