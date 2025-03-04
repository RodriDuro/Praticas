/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.descobrirsexo;

/**
 *
 * @author rodri
 */
public class DescobrirSexo {

    public static void main(String[] args) {
        int M = 0;
        int F = 0;
        for (int i = 0; i < 30; i++) {
        int numAleatorio = (int)(Math.random() * 2 ) + 1;
            System.out.println(numAleatorio);
            if (numAleatorio == 1){
                M++;
            }  else {
                F++;
            }
     }
        System.out.printf("Tem %d Homens e %d Mulheres",M,F);
    }
}
