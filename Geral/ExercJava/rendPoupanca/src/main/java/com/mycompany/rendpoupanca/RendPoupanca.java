/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rendpoupanca;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class RendPoupanca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float vlrPoup;
        
        System.out.print("Digite o valor atual na conta poupança: ");
        vlrPoup = scan.nextFloat();
        System.out.printf("Nesse mes seu rendimento foi de %.3f com a taxa de 0.07%% a.m ",(vlrPoup*0.0007));
        
        
    }
}
