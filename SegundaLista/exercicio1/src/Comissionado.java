public class Comissionado extends Administrador {

    private double totalVendas;
    private double comissao;


    public Comissionado(String nome, String sobrenome, double salarioMensal, double totalVendas, double comissao) {
        super(nome, sobrenome, salarioMensal);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioMensal() + getTotalVendas() * getComissao();
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", total de vendas=%.2f", totalVendas) +
                String.format(", comissao=%.2f",comissao);
    }
}
