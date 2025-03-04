/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comparanum;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ComparaNum {

    public static void main(String[] args) {
        int num;
        char continuar = 's';
        Scanner scan = new Scanner(System.in);
        
        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite um numero: ");
            num = scan.nextInt();
            
            if (num < 25){
                System.out.println("Esse numero e menor que 25");
            } else if (num > 80){
                System.out.println("Esse numero e maior que 80");
            } else if (num == 40) {
                System.out.println("Esse numero e igual a 40");
            } else {
                System.out.println("Esse numero e normal");
            }
        System.out.print("Deseja continuar (S/N): ");
        continuar = scan.next().charAt(0);
        }
         
    }
}
