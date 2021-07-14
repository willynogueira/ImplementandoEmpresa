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
public class MateriaPrima {
    private String origem;
    private int codigo;
    private float custo;

    public MateriaPrima(String origem, int codigo, float custo) {
        this.origem = origem;
        this.codigo = codigo;
        this.custo = custo;
    }
    
    public void mostrar() {
        System.out.println("Origem " + this.getOrigem());
        System.out.println("Código " + this.getCodigo());
        System.out.println("Custo R$" + String.format("%.02f", this.getCusto()));
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    
    
}
