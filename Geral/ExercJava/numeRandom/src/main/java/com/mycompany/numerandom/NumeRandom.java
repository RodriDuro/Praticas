/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numerandom;


/**
 *
 * @author rodri
 */
public class NumeRandom {

    public static void main(String[] args) {
        int achei = 0;
        
        
        for (int i = 0; i < 80; i++) {
        int numAleatorio = (int)(Math.random() * 200 ) + 1;
            System.out.println("Achei o numero " + numAleatorio);
            if (numAleatorio >= 10 && numAleatorio <= 150){
                achei++;
            }  
     }
        System.out.println("Achei " + achei + " numeros entre 10 e 150");
    }
}
