/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.contabancaria;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);

        Conta contabancaria = new Conta();
        
        System.out.println("Bem vindo! Digite a senha do seu banco para que possamos prosseguir:");
        contabancaria.setSenha(teclado.nextInt());
        
        System.out.println("Por favor digite seu numero do banco:");
        contabancaria.setNumero(teclado.nextInt());
       
        System.out.println("Por favor digite seu numero da agencia do banco:");
        contabancaria.setAgencia(teclado.nextInt());
        
        System.out.println("Por favor digite seu saldo:");
        contabancaria.setSaldo(teclado.nextDouble());
        
        System.out.println("Seu limite é de R$1000.00 reais.");
        contabancaria.setLimite(1000);
        
        System.out.println("Digite o valor do saque a ser retirado:");
        contabancaria.realizarSaque(teclado.nextDouble());
        
        System.out.printf("Saldo atual: %f\n" +
                "Limite disponivel %f\n", contabancaria.getSaldo(),
                contabancaria.getLimiteDisponivel());
        
    }
    
}