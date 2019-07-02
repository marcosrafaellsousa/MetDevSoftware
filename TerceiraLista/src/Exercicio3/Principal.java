package Exercicio3;

import Exercicio1.Cliente;
import Exercicio1.EntradaDeDados;

import java.io.*;
import java.util.ArrayList;
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
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clientesLista);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("clientes.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.readObject());
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
