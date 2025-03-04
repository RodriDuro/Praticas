/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vendadesconto;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class VendaDesconto {

    public static void main(String[] args) {
        double custoCarro = 1, descCarro = 0,vlrCarroDesc,vlrCarroFinal;

        int combustivel;
        double totalVenda = 0.0f, totalDesc = 0.0f;
        Scanner scan = new Scanner(System.in);   
        
        while (custoCarro != 0) {
            
            System.out.print("Digite o valor do carro: ");
            custoCarro = scan.nextFloat();
            
            if (custoCarro == 0){
                break;
                
            } else {
                System.out.print("""
                                 Digite o tipo de combustivel:
                                 1 - Álcool
                                 2 - Gasolina
                                 3 - Diesel
                                 """);
                combustivel = scan.nextInt();
                
                switch(combustivel){
                    case 1 -> descCarro = 0.25;
                    case 2 -> descCarro = 0.21;
                    case 3 -> descCarro = 0.14;
                }
                
                vlrCarroDesc = custoCarro * descCarro;  
                vlrCarroFinal = custoCarro - vlrCarroDesc;
                totalVenda += vlrCarroFinal;
                totalDesc += vlrCarroDesc;
                
                System.out.printf("O Custo do carro com desconto e R$%.2f",vlrCarroFinal);
                System.out.printf(" com desconto de R$%.2f.\n",vlrCarroDesc);
            }
        }
        System.out.printf("o Total da venda fica em R$%.2f e o desconto total R$%.2f\n",totalVenda,totalDesc);
    }
}
