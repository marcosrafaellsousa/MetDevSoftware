public class Horista extends Funcionario {

    private double quantHoras;
    private double valorHora;

    public Horista(String nome, String sobrenome, double quantHoras, double valorHora) {
        super(nome, sobrenome);
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    public double getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(double quantHoras) {
        this.quantHoras = quantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        return getQuantHoras() * getValorHora();
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", quantidade de horas=%.2f", quantHoras) +
                String.format(", valorHora=", valorHora);
    }
}
