package repositorio;

import janelas.JanelaPrincipal;
import modelo.Locadora;
import repositorio.excecoes.ObjetoNaoEncontrado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class RepoLocadora {

    private static RepoLocadora instancia;

    private RepoLocadora () {
    }

    public static RepoLocadora obtemInstancia () {
        if (instancia == null) {
            instancia = new RepoLocadora();
        }
        return instancia;
    }

    private List<Locadora> lista = new ArrayList<>();

    public List<Locadora> lista() {
        return this.lista;
    }

    public void incluir(Locadora locadora) {
        this.lista.add(locadora);
        salvarNoArquivo();
    }

    public void excluir(Locadora locadora) {
        this.lista.remove(locadora);
        salvarNoArquivo();
    }

    public Locadora buscarPorId(long id) throws ObjetoNaoEncontrado {
        for (Locadora locadora : lista) {
            if (locadora.getId() == id) {
                return locadora;
            }
        }
        throw new ObjetoNaoEncontrado();
    }

    public void salvarNoArquivo() {
        try {
            File file = new File("listaLocadoras.txt");
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

    public void carregarDoArquivo() {
        try {
            File file = new File("listaLocadoras.txt");
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                this.lista = (List<Locadora>) ois.readObject();
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
