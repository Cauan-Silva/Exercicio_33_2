package Produtos;

public class Produto {
    private int codigo;
    private String nome;
    private String grupo;
    private double precoVenda;
    private String unidade;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, String grupo, double precoVenda, String unidade, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.precoVenda = precoVenda;
        this.unidade = unidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString() {
        return String.format("Produto[codigo=%d, nome=%s, grupo=%s, precoVenda=%.2f, unidade=%s, quantidadeEstoque=%d]",
                codigo, nome, grupo, precoVenda, unidade, quantidadeEstoque);
    }
}
