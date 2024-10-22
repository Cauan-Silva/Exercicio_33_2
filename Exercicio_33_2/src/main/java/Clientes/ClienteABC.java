package Clientes;

public class ClienteABC {
    public int codigo;
    public String nome;
    public String endereco;
    public String telefone;
    public String bairro;
    public String cpf;
    private String rg;

    public ClienteABC(int codigo, String nome, String endereco, String telefone, String bairro, String cpf, String rg) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.bairro = bairro;
        this.cpf = cpf;
        this.rg = rg;
    }

    // Getters e toString()
    public String toString() {
        return String.format("ClienteABC[codigo=%d, nome=%s, endereco=%s, telefone=%s, bairro=%s, cpf=%s, rg=%s]",
                codigo, nome, endereco, telefone, bairro, cpf, rg);
    }
}
