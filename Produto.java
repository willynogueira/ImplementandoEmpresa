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
public class Produto {
    private String designacao;
    private float precoVendaPublico;
    private int stock;

    public Produto(String designacao, float precoVendaPublico, int stock) {
        this.designacao = designacao;
        this.precoVendaPublico = precoVendaPublico;
        this.stock = stock;
    }
    
    public void mostrar() {
        System.out.println("Designação: " + this.getDesignacao());
        System.out.println("Preço Venda Público R$ " +String.format("%.02f",this.getPrecoVendaPublico()));
        System.out.println("Estoque: " + this.getStock());
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public float getPrecoVendaPublico() {
        return precoVendaPublico;
    }

    public void setPrecoVendaPublico(float precoVendaPublico) {
        this.precoVendaPublico = precoVendaPublico;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
