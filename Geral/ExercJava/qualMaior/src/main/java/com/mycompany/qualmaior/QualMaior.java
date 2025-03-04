/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.qualmaior;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class QualMaior {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1,n2;
        
        System.out.print("Digite um numero: ");
        n1 = scan.nextInt();
        System.out.print("Digite outro numero: ");
        n2 = scan.nextInt();
        
        if (n1 > n2) {
            System.out.printf("O numero %d e maior que %d\n",n1,n2);
        } else if (n1 < n2) {
            System.out.printf("O numero %d e maior que %d\n",n2,n1);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}
