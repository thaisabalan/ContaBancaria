/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.contabancaria;

/**
 *
 * @author aluno
 */
public class Conta extends BaseBancaria{
    
    public void realizarDeposito(double valor){
        this.saldo += valor;
    } 
    
    private boolean validarSaque(double valor){
        double totalSaldo = this.saldo - valor;
        
        if(totalSaldo >  this.limite * -1){
            return true;
        }
            return false;
    }
    
    public void realizarSaque(double valor){
        if(this.validarSaque(valor)){
            this.saldo -= valor;
    } else{
            System.out.println("Voce nao possui saldo suficiente para realizar a operacao de saque!");
        }
    
    }

    int setNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}