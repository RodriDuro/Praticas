/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numigualdiff;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class NumIgualDiff {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, num2;
        
        System.out.print("Digite o 1º numero: ");
        num = scan.nextInt();
        System.out.print("Digite o 2º numero: ");
        num2 = scan.nextInt();
        
        if (num == num2){
            System.out.print("Os numeros são iguais");
        } else if (num > num2) {
            System.out.printf("Numeros são diferentes, numero %d e maior que %d",num,num2);
        } else if (num < num2) {
            System.out.printf("Numeros são diferentes, numero %d e maior que %d",num2,num);
        }
    }
}
