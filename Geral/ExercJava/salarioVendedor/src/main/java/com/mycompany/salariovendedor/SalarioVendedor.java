/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.salariovendedor;

import java.util.Scanner;

/**
 *
 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
public class SalarioVendedor {

    public static void main(String[] args) {
        String nomeVendedor;
        float salFixo;
        float vlrVendasMensal;
        double comissMes;
        double salComissao;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = scan.nextLine();
        System.out.printf("Digite o salario fixo de %s: ",nomeVendedor);
        salFixo = scan.nextFloat();
        System.out.printf("Quanto de vendas o %s efetuou no mes: ",nomeVendedor);
        vlrVendasMensal = scan.nextFloat();
        comissMes = vlrVendasMensal * 0.15;
        salComissao = salFixo + comissMes;
        
        System.out.printf("""
                          O Vendedor %s que recebe o salario fixo de R$%.2f mensal,
                          efetuou o total de R$%.2f em vendas, com a comissao de R$%.2f, 
                          somando os valores, seu salario nesse mes e de R$%.2f
                          """,nomeVendedor,salFixo,vlrVendasMensal,comissMes,salComissao);
        
        if (salComissao <= 1900){
            System.out.println("e esta isento de desconto de Imposto de renda");
        } else if (salComissao >= 1900.01 && salComissao <= 2800){
            double descIR = salComissao * 0.075;
            System.out.printf("Tera um desconto 7.5%% de sendo deduzido R$%.2f,"
                    + " restando o valor de R$%.2f",descIR,(salComissao-descIR));            
        } else if (salComissao >= 2800.01 && salComissao <= 3800){
            double descIR = salComissao * 0.15;
            System.out.printf("Tera um desconto 15%% de sendo deduzido R$%.2f,"
                    + " restando o valor de R$%.2f",descIR,(salComissao-descIR));
        } else if (salComissao >= 3800.01 && salComissao <= 4800){
            double descIR = salComissao * 0.225;
            System.out.printf("Tera um desconto 22.5%% de sendo deduzido R$%.2f,"
                    + " restando o valor de R$%.2f",descIR,(salComissao-descIR));
        } else {
             double descIR = salComissao * 0.275;
            System.out.printf("Tera um desconto 27.5%% de sendo deduzido R$%.2f,"
                    + " restando o valor de R$%.2f",descIR,(salComissao-descIR));
        }
        
        
    }
}
