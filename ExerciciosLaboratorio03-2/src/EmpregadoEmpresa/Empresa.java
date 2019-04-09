package EmpregadoEmpresa;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa(String cnpj, String razaoSocial, Endereco endereco) {
        this.setCnpj(cnpj);
        this.setRazaoSocial(razaoSocial);
        this.setEndereco(endereco);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format("Empresa%n" +
                "cnpj=" + cnpj + "%n" +
                "razaoSocial=" + razaoSocial + "%n" + endereco);
    }
}
