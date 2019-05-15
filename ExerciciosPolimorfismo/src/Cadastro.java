public class Cadastro {

        public static void main (String args []) {

            ContaCorrente contaCorrente = new ContaCorrente();
            contaCorrente.setTitular("Joaquin Martelo");
            contaCorrente.setNumero(1);
            contaCorrente.setSaldo(6000.0);

            ContaPoupanca contaPoupanca = new ContaPoupanca();
            contaPoupanca.setNumero(2);
            contaPoupanca.setTitular("Maria Silva");
            contaPoupanca.setSaldo(50000.0);

            System.out.println(contaCorrente);
            contaCorrente.depositar(400.0);
            System.out.println("Saldo apos deposito: " + contaCorrente.getSaldo());
            contaCorrente.sacar(1200.0);
            System.out.println("Saldo apos saque: " + contaCorrente.getSaldo());

            System.out.println(contaPoupanca);
            contaPoupanca.depositar(400.0);
            System.out.println("Saldo apos deposito: " + contaPoupanca.getSaldo());
            contaPoupanca.sacar(1200.0);
            System.out.println("Saldo apos saque: " + contaPoupanca.getSaldo());
            contaPoupanca.atualizaSaldo(10.0);
            System.out.println("Saldo apos atualizacao: " + contaPoupanca.getSaldo());

            ContaCorrente contaCorrente1 = new ContaCorrente();
            contaCorrente1.setTitular("Joao");
            contaCorrente1.setNumero(3);
            contaCorrente1.setSaldo(150.0);

            ContaPoupanca contaPoupanca1 = new ContaPoupanca();
            contaPoupanca1.setNumero(4);
            contaPoupanca1.setTitular("Jack Sparrow");
            contaPoupanca1.setSaldo(0.0);

            System.out.println(contaCorrente1);
            System.out.println(contaPoupanca1);
            contaCorrente1.transferir(contaPoupanca1, 50.0);
            System.out.println("Saldo da conta corrente depois de realizar transferencia: " + contaCorrente1.getSaldo());
            System.out.println("Saldo da conta poupanca depois de receber a transferencia: " + contaPoupanca1.getSaldo());
            System.out.println();

            ContaSalario contaSalario = new ContaSalario();
            contaSalario.setNumero(5);
            contaSalario.setTitular("Da Vinci");
            contaSalario.setSaldo(400.00);

            System.out.println(contaSalario);
            contaSalario.sacar(200.0);
            System.out.println("Saldo apos saque: " + contaSalario.getSaldo());
            contaSalario.depositar(100.0);
            System.out.println("Saldo apos deposito: " + contaSalario.getSaldo());
            System.out.println();

            System.out.println("Saldo  contaPoupança1 antes de receber transferencia: " + contaPoupanca1.getSaldo());
            contaSalario.transferir(contaPoupanca1, 30.0);
            System.out.println("Saldo apos realizar transferencia: " + contaSalario.getSaldo());
            System.out.println("Saldo apos receber transferencia: " + contaPoupanca1.getSaldo());
        }
}
