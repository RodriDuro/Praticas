/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.precocusto;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class PrecoCusto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float vlrCusto, vlrVenda;
        double vlrCustoTot = 0,vlrVendaTot = 0;
        int i = 0;
        
        for (; i < 40; i++) {
            System.out.print("Digite o valor de custo do produto: ");
            vlrCusto = scan.nextFloat();
            System.out.print("Digite o valor de venda do produto: ");
            vlrVenda = scan.nextFloat();

            if (vlrCusto < vlrVenda) {
                System.out.printf("Produto voi vendido com lucro de R$%.2f\n",(vlrVenda - vlrCusto));
            } else if (vlrCusto > vlrVenda) {
                System.out.printf("Produto voi vendido com prejuizo de R$%.2f\n",(vlrVenda - vlrCusto));
            } else {
                System.out.println("Produto voi vendido sem lucro ou prejuizo\n");
            }
            vlrCustoTot += vlrCusto;
            vlrVendaTot += vlrVenda;
        }
        System.out.printf("Custo total medio foi de %.2f e valor de venda total medio foi de %.2f ",(vlrCustoTot/i),(vlrVendaTot/i));
    }
}
