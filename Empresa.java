/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementandoempresa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lbarceloss
 */
public class Empresa {
    private String nome;
    private int dataFundacao;
    private CodigoPostal cp;
    
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Empregado> empregados = new ArrayList<>();
    private final List<Fornecedor> fornecedores = new ArrayList<>();
    private final List<Produto>produtos = new ArrayList<>();

    public Empresa(String nome, int dataFundacao, CodigoPostal cp) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.cp = cp;
    }
    
    public void addPessoa(Cliente c) {
        this.clientes.add(c);
    }
    
    public void addPessoa(Empregado e) {
        this.empregados.add(e);
    }
    
    public void addPessoa(Fornecedor f) {
        this.fornecedores.add(f);
    }
    
    public void mostrarPessoas() {
       for (Cliente cliente : this.clientes) {
            cliente.mostrar();
        }
       for (Empregado empregado : this.empregados) {
            empregado.mostrar();
        }
       for (Fornecedor fornecedor : this.fornecedores) {
            fornecedor.mostrar();
        }
    }
    
    public void addProduto(Produto p) {
        this.produtos.add(p);
    }
    
    public void mostrarProdutos() {
        for (Produto produto : this.produtos) {
            produto.mostrar();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(int dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCp() {
        return cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }
    
    
}
