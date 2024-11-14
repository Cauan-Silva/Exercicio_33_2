package Produtos;

public class ProdutoXYZ {
    public int codigo;
    public String nome;
    public String grupo;
    private double precoCusto;
    public double precoVenda;
    public String unidade;
    public int quantidadeEstoque;

    public ProdutoXYZ(int codigo, String nome, String grupo, double precoCusto, double precoVenda, String unidade, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.unidade = unidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString() {
        return String.format("ProdutoXYZ[codigo=%d, nome=%s, grupo=%s, precoCusto=%.2f, precoVenda=%.2f, unidade=%s, quantidadeEstoque=%d]",
                codigo, nome, grupo, precoCusto, precoVenda, unidade, quantidadeEstoque);
    }
}
