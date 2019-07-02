package Exercicio2;

import Exercicio1.Cliente;
import Exercicio1.EntradaDeDados;

import java.io.*;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Cliente> clientesLista = EntradaDeDados.entrarClientes();
        try {
            File file = new File("clientes.txt");
            if (file.exists())
                file.delete();
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (Cliente cliente : clientesLista) {
                bw.write(cliente.getNome() + "-" + cliente.getSexo()+ "-" + cliente.getIdade());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
