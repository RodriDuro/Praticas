/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.precocarro;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class PrecoCarro {

    public static void main(String[] args) {
        float vlrCustoFabrica,percDist = 0.28f,imposto = 0.45f;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o custo de fabrica do veiculo: ");
        vlrCustoFabrica = scan.nextFloat();
        System.out.printf("O custo do veiculo para o consumidor e de R$%.2f\n",(vlrCustoFabrica+(vlrCustoFabrica*percDist)+(vlrCustoFabrica*imposto)));
        System.out.printf("Sendo R$%.2f de 28%% referente ao distribuidor\n",(vlrCustoFabrica*percDist));
        System.out.printf("Sendo R$%.2f de 45%% referente a impostos\n",(vlrCustoFabrica*imposto));
        
    }
}
