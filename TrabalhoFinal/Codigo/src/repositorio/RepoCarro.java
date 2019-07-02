package repositorio;

import modelo.Carro;
import modelo.Categoria;
import modelo.Locadora;
import repositorio.excecoes.ObjetoNaoEncontrado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepoCarro implements Repo<Carro> {

    private static RepoCarro instancia;

    private RepoCarro () {
    }

    public static RepoCarro obtemInstancia () {
        if (instancia == null) {
            instancia = new RepoCarro();
        }
        return instancia;
    }

    private List<Carro> lista = new ArrayList<>();

    public List<Carro> lista () {
        return this.lista;
    }

    public void incluir (Carro carro) {
        this.lista.add(carro);
        salvarNoArquivo();
    }

    public void excluir (Carro carro) {
        this.lista.remove(carro);
        salvarNoArquivo();
    }

    public Carro buscarPorId (long id) throws ObjetoNaoEncontrado {
        for (Carro carro : lista) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        throw new ObjetoNaoEncontrado();
    }

    public List<Carro> buscarPorCategoria (Categoria categoria) {
        List<Carro> resultado = new ArrayList<>();
        for (Carro carro : lista) {
            if (carro.getCategoria() == categoria) {
                resultado.add(carro);
            }
        }
        return resultado;
    }

    public List<Carro> buscarPorLocadora (Locadora locadora) {
        List<Carro> resultado = new ArrayList<>();
        for (Carro carro : lista) {
            for (Carro carroLocadora : locadora.getCarrosList()) {
                if (carro.equals(carroLocadora)) {
                    resultado.add(carro);
                }
            }
        }
        return resultado;
    }

    public List<Carro> buscarPorCategoriaELocadora (Categoria categoria, Locadora locadora) {
        List<Carro> resultado = new ArrayList<>();
        for (Carro carro : lista) {
            for (Carro carroLocadora : locadora.getCarrosList()) {
                if (carro.equals(carroLocadora) && carro.getCategoria() == categoria) {
                    resultado.add(carro);
                }
            }
        }
        return resultado;
    }




    public void salvarNoArquivo () {
        try {
            File file = new File("listaCarros.txt");
            if (file.exists())
                file.delete();
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.lista);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarDoArquivo () {
        try {
            File file = new File("listaCarros.txt");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                this.lista = (List<Carro>)ois.readObject();
                ois.close();
                fis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
