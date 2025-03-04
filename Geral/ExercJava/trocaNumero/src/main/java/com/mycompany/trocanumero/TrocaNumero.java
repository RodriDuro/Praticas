/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trocanumero;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class TrocaNumero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("Digite numero A: ");
        a = scan.nextInt();
        System.out.print("Digite numero B: ");
        b = scan.nextInt();
        c = a;
        a = b;
        b = c;
        
        System.out.printf("Agora os numeros da variavel A: %d e B: %d",a,b);
    }
}
