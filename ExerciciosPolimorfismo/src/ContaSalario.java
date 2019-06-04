public class ContaSalario extends ContaCorrente{

    private final double TAXA = 0.01;

    @Override
    public void sacar (double valor) {
        this.setSaldo(this.getSaldo() - (valor + TAXA));
    }

    @Override
    public void depositar (double valor) {
        this.setSaldo(this.getSaldo() + (valor - TAXA));
    }
}
