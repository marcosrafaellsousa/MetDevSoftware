package com.github.marcosrafaellsousa.AtividadeSupervisionada2;

public class Produto {
    String codigo;
    String nomeProduto = "";
    int quantidade;
    String tipo = "";
    double valor;

    public Produto (String codigo) {
        this.codigo = codigo;
    }

    public Produto (String codigo, String nomeProduto) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
    }

    public Produto (String codigo, String nomeProduto, int quantidade) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }

    public Produto (String codigo, String nomeProduto, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String vender (int quantVendParam) {
        String resultado = "";
        if (quantidade == 0)
            resultado = "Nao existe estoque suficiente para realizar a venda";
        else {
            quantidade -= quantVendParam;
            resultado = String.format ("Foram vendidos %d produtos, o estoque atual é de %d produtos %nO valor da " +
                    "venda foi de %.2fR$", quantVendParam, quantidade, (quantVendParam * valor));
            if (valor == 0.0)
                resultado += "(o valor deste produto nao foi definido)";
        }
        return resultado;
    }

    public void comprar (int quantCompParam, double novoValorParam){
        quantidade += quantCompParam;
        valor = novoValorParam;
    }

    public void comprar (int quantCompParam) {
        quantidade += quantCompParam;
    }

    public String consultar (){
        String resultado = String.format("Codigo = %s%nNome do produto = %s%nQuantidade = %d%nTipo = %s%n" +
                "Valor = %.2f", codigo, nomeProduto, quantidade, tipo, valor);
        return resultado;
    }

    public void inserir (String nomeProdutoParam, int quantidadeParam, String tipoParam, double valorParam) {
        nomeProduto = nomeProdutoParam;
        quantidade = quantidadeParam;
        tipo = tipoParam;
        valor = valorParam;
    }

    public boolean igual (Produto produtoParam) {
        return (nomeProduto.equals(produtoParam.nomeProduto) && tipo.equals(produtoParam.tipo));
    }
}
