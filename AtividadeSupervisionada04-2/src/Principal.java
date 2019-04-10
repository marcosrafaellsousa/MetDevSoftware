import java.util.ArrayList;
import java.util.Random;

public class Principal {

    public static void main (String args[]) {

        CaixaBanco caixaBanco1 = new CaixaBanco("Zezinho","001");
        caixaBanco1.setHorario("8:00 - 18:00");
        caixaBanco1.setTelefone("99999999");
        caixaBanco1.setSalario(3000.00);

        caixaBanco1.aumentarSalario(10);

        System.out.println(caixaBanco1);


        Gerente gerente1 = new Gerente("Luffy","002");
        gerente1.setTelefone("66666666");
        gerente1.setSalario(3400.00);
        gerente1.setBonificacao(400.00);
        gerente1.setTipo("Financeiro");

        gerente1.aumentarSalario(20);

        System.out.println(gerente1);


        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("cli1","11111111", 20, "3214325342543");
        listaClientes.add(cliente1);
        Cliente cliente2 = new Cliente("cli2","22222222", 20, "3214325342522");
        listaClientes.add(cliente2);
        Cliente cliente3 = new Cliente("cli3","33333333", 20, "3214325343333");
        listaClientes.add(cliente3);

        Random random = new Random();
        int aleatorio = random.nextInt(3);

        listaClientes.get(aleatorio).desativaCliente();

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}
