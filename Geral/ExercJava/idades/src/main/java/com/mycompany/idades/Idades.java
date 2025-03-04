/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.idades;

/**
 *
 * @author rodri
 */
public class Idades {

    public static void main(String[] args) {
        for (int i = 0; i < 75; i++) {
        int numAleatorio = (int)(Math.random() * 100 ) + 1;
            System.out.print("Você tem " + numAleatorio + " anos");
            if (numAleatorio >= 18 && numAleatorio <= 100){
                System.out.print(" é maior de idade\n");
            }  else {
                System.out.print(" é menor de idade\n");
            }
     }
    }
}
