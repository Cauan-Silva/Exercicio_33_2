package clientes;

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cpf;
    private String telefone;

    public Cliente(int codigo, String nome, String endereco, String bairro, String cpf, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Getters e toString()
    public String toString() {
        return String.format("Cliente[codigo=%d, nome=%s, endereco=%s, bairro=%s, cpf=%s, telefone=%s]",
                codigo, nome, endereco, bairro, cpf, telefone);
    }
}
