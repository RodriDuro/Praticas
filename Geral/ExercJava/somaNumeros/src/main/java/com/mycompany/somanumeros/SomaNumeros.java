/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.somanumeros;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class SomaNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o 1 numero: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o 2 numero: ");
        int n2 = teclado.nextInt();
        int soma = n1 + n2;
        System.out.printf("A Soma de %d e %d e %d",n1, n2, soma);
               
    }
}
