/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementandoempresa;

import java.util.Vector;

/**
 *
 * @author lbarceloss
 */
public class Fornecedor extends Pessoa {
    private float plafond;
    private float valorEmDivida;
    private Vector fornece;

    public Fornecedor(float plafond, float valorEmDivida, String nome, long contribuinte, byte idade, CodigoPostal cp) {
        super(nome, contribuinte, idade, cp);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;
    }
    
    public float obterSaldo() {
        return this.getPlafond() - this.getValorEmDivida();
    }
    
    public void addFornece(Fornece f) {
        this.fornece.add(f);
    }
    
    public void removeFornece(int i) {
        this.fornece.remove(i);
    }
    
    public void mostrar() {
        System.out.println("Nome " + this.getNome());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Contribuinte " + this.getContribuinte());
        System.out.println("Plafond " + this.getPlafond());
        System.out.println("Dívida R$" + String.format("%.02f", this.getValorEmDivida()));
        this.getCp().mostrar();
    }

    public float getPlafond() {
        return plafond;
    }

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }

    public float getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(float valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public Vector getFornece() {
        return fornece;
    }

    public void setFornece(Vector fornece) {
        this.fornece = fornece;
    }
    
    
    
}
