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
public class Empregado extends Pessoa {
    private int numeroSeccao;
    private float salarioBase;
    private float iRS;

    public Empregado(int numeroSeccao, float salarioBase, float iRS, String nome, long contribuinte, byte idade, CodigoPostal cp) {
        super(nome, contribuinte, idade, cp);
        this.numeroSeccao = numeroSeccao;
        this.salarioBase = salarioBase;
        this.iRS = iRS;
    }

    public void mostrar() {
        System.out.println("Nome " + this.getNome());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Contribuinte " + this.getContribuinte());
        System.out.println("Secção " + this.getNumeroSeccao());
        System.out.println("Salário Base " + String.format("%.02f", this.getSalarioBase()));
        System.out.println("iRS " + this.getiRS());
        System.out.println("Salário: " + String.format("%.02f", this.calcularSalario()));
    }
    
    public float calcularSalario() {
        return this.getSalarioBase() - (this.getSalarioBase() * this.getiRS());
    }

    public int getNumeroSeccao() {
        return numeroSeccao;
    }

    public void setNumeroSeccao(int numeroSeccao) {
        this.numeroSeccao = numeroSeccao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getiRS() {
        return iRS;
    }

    public void setiRS(float iRS) {
        this.iRS = iRS;
    }
    
    
}
