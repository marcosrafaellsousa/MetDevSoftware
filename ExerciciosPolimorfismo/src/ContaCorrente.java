public class ContaCorrente extends Conta{

    private final double TAXA = 0.05;

    @Override
    public void sacar (double valor) {
            this.setSaldo(this.getSaldo() - (valor + TAXA));
    }

    @Override
    public void depositar (double valor) {
            this.setSaldo(this.getSaldo() + (valor - TAXA));
    }
}
