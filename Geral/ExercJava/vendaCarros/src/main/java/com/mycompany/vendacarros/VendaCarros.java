/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vendacarros;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class VendaCarros {

    public static void main(String[] args) {
        double custoCarro,descCarro;
        double vlrFinal;
        int anoCarro;
        int f = 0;
        int t = 0;
        double totalVenda = 0.0f;
        char continuar = 's';
        Scanner scan = new Scanner(System.in);
        
        while (continuar == 's' || continuar == 'S') {            
            System.out.print("Digite o valor do carro: ");
            custoCarro = scan.nextFloat();
            System.out.print("Digite o ano do carro: ");
            anoCarro = scan.nextInt();
        
            if (anoCarro >= 2000) {
                descCarro = custoCarro* 0.07;
            } else {
                descCarro = custoCarro* 0.12;
                f++;
            }
            t++;
            vlrFinal = custoCarro-descCarro;
            totalVenda += vlrFinal;
            System.out.printf("Carro sai a R$%.2f, com R$%.2f de desconto.\n",vlrFinal,descCarro);
            
        System.out.print("Deseja continuar (S/N): ");
        continuar = scan.next().charAt(0);
        }
        System.out.printf("Existe %d carros, sendo que ate o ano 2000 são %d, ",t,f);
        System.out.printf("o total da venda fica em R$%.2f\n",totalVenda);
        
        
        

    }
}
