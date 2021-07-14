/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementandoempresa;

/**
 *
 * @author lbarceloss
 */
public class Fornece {
    private Fornecedor fornecedor;
    private MateriaPrima materia;
    private int quantidade;
    private int data;

    public Fornece(Fornecedor fornecedor, MateriaPrima materia, int quantidade, int data) {
        this.fornecedor = fornecedor;
        this.materia = materia;
        this.quantidade = quantidade;
        this.data = data;
    }
    
    public void mostrar() {
        this.fornecedor.mostrar();
        this.materia.mostrar();
        System.out.println("Quatidade " + this.getQuantidade());
        System.out.println("Data " + this.getData());
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public MateriaPrima getMateria() {
        return materia;
    }

    public void setMateria(MateriaPrima materia) {
        this.materia = materia;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
