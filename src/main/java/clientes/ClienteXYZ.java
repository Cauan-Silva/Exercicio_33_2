package clientes;

public class ClienteXYZ {
    public int codigo;
    public String nome;
    public String endereco;
    public String bairro;
    public String cpf;
    public String fone;

    public ClienteXYZ(int codigo, String nome, String endereco, String bairro, String cpf, String fone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
        this.fone = fone;
    }

    // Getters e toString()
    public String toString() {
        return String.format("ClienteXYZ[codigo=%d, nome=%s, endereco=%s, bairro=%s, cpf=%s, fone=%s]",
                codigo, nome, endereco, bairro, cpf, fone);
    }
}
