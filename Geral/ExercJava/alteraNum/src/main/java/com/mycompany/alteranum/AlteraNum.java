/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alteranum;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class AlteraNum {

    public static void main(String[] args) {
        char continuar = 's';
        int num;
        Scanner scan = new Scanner(System.in);
        
        while (continuar == 's' || continuar == 'S') { 
            System.out.print("Digite um numero: ");
            num = scan.nextInt();
            System.out.printf("Convertendo o numero da %d \n",num - (num * 2));
            
        System.out.print("Deseja continuar (S/N): ");
        continuar = scan.next().charAt(0);
        }
    }
}
