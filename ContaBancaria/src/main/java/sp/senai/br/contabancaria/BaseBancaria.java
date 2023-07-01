/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.contabancaria;

/**
 *
 * @author aluno
 */
public class BaseBancaria {
    
    protected int numero;
    protected int agencia;
    protected double saldo;
    protected double limite;
    protected String[] chavePix;
    protected int senha;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String[] getChavePix() {
        return chavePix;
    }

    public void setChavePix(String[] chavePix) {
        this.chavePix = chavePix;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public double getSaldoToltal() {
        return this.saldo + this.limite;
    }

    public double getLimiteDisponivel() {

        if(this.saldo < 0){
            return this.limite - Math.abs(this.saldo);
        }
        return this.limite;
    }
}
