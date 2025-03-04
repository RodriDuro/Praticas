/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversaodolar;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ConversaoDolar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dolAtual,qtdDol;
        
        
        System.out.print("Digite a cotação atual do dolar: ");
        dolAtual = scan.nextFloat();
        System.out.print("Quantos dolares deseja converter: ");
        qtdDol = scan.nextFloat();
        System.out.printf("A quantidade de %.2f USD em Reais fica R$ %.2f",qtdDol,(qtdDol*dolAtual));
        
    }
}
