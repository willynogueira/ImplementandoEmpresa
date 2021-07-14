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
public class Pessoa {
    private String nome;
    private long contribuinte;
    private byte idade;
    private CodigoPostal cp;

    public Pessoa(String nome, long contribuinte, byte idade, CodigoPostal cp) {
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
        this.cp = cp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(long contribuinte) {
        this.contribuinte = contribuinte;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public CodigoPostal getCp() {
        return cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }
    
    
}
