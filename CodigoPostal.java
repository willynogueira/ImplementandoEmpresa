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
public class CodigoPostal {
    private int indicativo;
    private int extensao;
    private String zona;

    public CodigoPostal(int indicativo, int extensao, String zona) {
        this.indicativo = indicativo;
        this.extensao = extensao;
        this.zona = zona;
    }
    
    public void mostrar() {
        System.out.println("Indicativo " + this.getIndicativo());
        System.out.println("Extensão " + this.getExtensao());
        System.out.println("Zona " + this.getZona());
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    public int getExtensao() {
        return extensao;
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
}
