/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversortemperatura;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ConversorTemperatura {

    public static void main(String[] args) {
        float temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em celsius para conversão: ");
        temp = scan.nextInt();
        
        System.out.printf("A temperadura de %.0fCº fica convertida em Fahrenheit %.2fFº",temp,((9*temp+160) / 5));
    }
}
