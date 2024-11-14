package produtos;

public class ProdutoABC {
    public int codigo;
    public String nome;
    public String grupo;
    public double precoVenda;
    public String unidade;
    public int quantidadeEstoque;

    public ProdutoABC(int codigo, String nome, String grupo, double precoVenda, String unidade, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.precoVenda = precoVenda;
        this.unidade = unidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String toString() {
        return String.format("ProdutoABC[codigo=%d, nome=%s, grupo=%s, precoVenda=%.2f, unidade=%s, quantidadeEstoque=%d]",
                codigo, nome, grupo, precoVenda, unidade, quantidadeEstoque);
    }
}
