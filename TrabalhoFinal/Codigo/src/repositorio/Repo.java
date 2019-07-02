package repositorio;

import repositorio.excecoes.ObjetoNaoEncontrado;

import java.util.List;

public interface Repo<T> {

    List<T> lista ();
    T buscarPorId(long id) throws ObjetoNaoEncontrado;
    void incluir (T t);
    void excluir (T t);
    void salvarNoArquivo ();
    void carregarDoArquivo ();
}
