/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.intervalos;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Intervalos {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        num = scan.nextInt();
        
        if (num >= 100 && num <= 200) {
            System.out.println("Esse numero esta no intervalo");
        } else {
            System.out.println("Esse numero esta fora do intervalo");
        }
    }
}
