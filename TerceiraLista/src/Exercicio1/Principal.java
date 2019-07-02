package Exercicio1;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Cliente> clientesLista = EntradaDeDados.entrarClientes();
        System.out.println(clientesLista);
    }
}
