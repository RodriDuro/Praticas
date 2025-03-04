/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numextenso;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class NumExtenso {

    public static void main(String[] args) {
        int num;
        char continuar = 's';
        Scanner scan = new Scanner(System.in);
        
        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o numero: ");
            num = scan.nextInt();

            switch(num){
                case 1 -> System.out.println("UM");
                case 2 -> System.out.println("DOIS");
                case 3 -> System.out.println("TRES");
                case 4 -> System.out.println("QUATRO");
                case 5 -> System.out.println("CINCO");
                default -> System.out.println("Numero invalido");
            }
        System.out.print("Deseja continuar (S/N): ");
        continuar = scan.next().charAt(0);
        }    
    }
}
