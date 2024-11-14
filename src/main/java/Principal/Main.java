package Principal;

import Clientes.Cliente;
import Clientes.ClienteABC;
import Clientes.ClienteXYZ;
import Produtos.Produto;
import Produtos.ProdutoABC;
import Produtos.ProdutoXYZ;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClienteABC> clientesABC = new ArrayList<>();
        List<ClienteXYZ> clientesXYZ = new ArrayList<>();
        List<ProdutoABC> produtosABC = new ArrayList<>();
        List<ProdutoXYZ> produtosXYZ = new ArrayList<>();

        clientesABC.add(new ClienteABC(1, "João", "Rua A", "1111-1111", "Centro", "111.111.111-11", "MG-12.345.678"));
        clientesXYZ.add(new ClienteXYZ(2, "Maria", "Rua B", "Centro", "222.222.222-22", "2222-2222"));

        produtosABC.add(new ProdutoABC(1, "Produto A", "Grupo 1", 50.00, "Unidade", 100));
        produtosXYZ.add(new ProdutoXYZ(2, "Produto B", "Grupo 2", 30.00, 60.00, "Unidade", 200));

        System.out.println("Clientes ABC antes da fusão:");
        for (ClienteABC cliente : clientesABC) {
            System.out.println(cliente);
        }
        System.out.println("Clientes XYZ antes da fusão:");
        for (ClienteXYZ cliente : clientesXYZ) {
            System.out.println(cliente);
        }

        System.out.println("Produtos ABC antes da fusão:");
        for (ProdutoABC produto : produtosABC) {
            System.out.println(produto);
        }
        System.out.println("Produtos XYZ antes da fusão:");
        for (ProdutoXYZ produto : produtosXYZ) {
            System.out.println(produto);
        }

        List<Cliente> clientesFusao = new ArrayList<>();
        for (ClienteABC cliente : clientesABC) {
            clientesFusao.add(new Cliente(cliente.codigo, cliente.nome, cliente.endereco, cliente.bairro, cliente.cpf, cliente.telefone));
        }
        for (ClienteXYZ cliente : clientesXYZ) {
            clientesFusao.add(new Cliente(cliente.codigo, cliente.nome, cliente.endereco, cliente.bairro, cliente.cpf, cliente.fone));
        }

        List<Produto> produtosFusao = new ArrayList<>();
        for (ProdutoABC produto : produtosABC) {
            produtosFusao.add(new Produto(produto.codigo, produto.nome, produto.grupo, produto.precoVenda, produto.unidade, produto.quantidadeEstoque));
        }
        for (ProdutoXYZ produto : produtosXYZ) {
            produtosFusao.add(new Produto(produto.codigo, produto.nome, produto.grupo, produto.precoVenda, produto.unidade, produto.quantidadeEstoque));
        }

        System.out.println("\nClientes após a fusão:");
        for (Cliente cliente : clientesFusao) {
            System.out.println(cliente);
        }

       System.out.println("Produtos após a fusão:");
        for (Produto produto : produtosFusao) {
            System.out.println(produto);
        }
    }
}
