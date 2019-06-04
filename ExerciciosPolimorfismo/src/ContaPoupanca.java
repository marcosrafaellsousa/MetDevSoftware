public class ContaPoupanca extends Conta{

    public void atualizaSaldo (double percentual) {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * percentual / 100.0));
    }
}
