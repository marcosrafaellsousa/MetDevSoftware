public class Cliente extends Pessoa {

    private int idade;
    private String cpf;
    private char status;

    public Cliente(String nome, String telefone, int idade, String cpf) {
        super(nome,telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.status = 'A';
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void desativaCliente () {
        if (this.status == 'A')
            this.status = 'I';
    }

    @Override
    public String toString() {
        String string = getNome() + " – Tel:" + getTelefone() + " – idade: " + idade + " anos - cpf: " + cpf + " - ";
        if (status == 'A')
            string += "ativo";
        else
            string += "inativo";
        return string;
    }
}