public class AssinanteAnual implements Assinante {

    private String nome;


    public AssinanteAnual(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void update() {
        System.out.println("O assinante Anual " + nome + " foi notificado");
    }
}
