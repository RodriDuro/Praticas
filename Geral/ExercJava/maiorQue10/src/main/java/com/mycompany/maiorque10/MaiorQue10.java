/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maiorque10;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class MaiorQue10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um numero: ");
        num = scan.nextInt();
        
        if (num > 10 ) {
            System.out.println("Esse numero e maior que 10");
        } else if (num == 10) {
            System.out.println("Esse numero e o 10!");
        } else {
            System.out.println("Esse numero e menor que 10");
        }
    }
}
