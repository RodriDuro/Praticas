/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculoparcela;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CalculoParcela {

    public static void main(String[] args) {
        
        float vlrProduto;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor a ser parcelado: ");
        vlrProduto = scan.nextFloat();
        System.out.printf("O produto que custa R$%.2f pode ser parcelado em 5x de R$%.2f \n",vlrProduto,(vlrProduto/5));
        
    }
}
