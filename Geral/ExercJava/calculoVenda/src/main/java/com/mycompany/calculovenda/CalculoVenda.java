/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculovenda;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CalculoVenda {

    public static void main(String[] args) {
        
        float vlrCusto,vlrPercentualAd,vlrFinal,vlrAcrescimo;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Digite o valor de custo: ");
        vlrCusto = scan.nextFloat();
        System.out.print("Qual a percentual de lucro: ");
        vlrPercentualAd = scan.nextFloat();
        vlrFinal = (vlrCusto*(vlrPercentualAd/100))+vlrCusto;
        vlrAcrescimo = vlrCusto*(vlrPercentualAd/100);
        System.out.printf("O produto que custa %.2f com o acrecimo de %.2f%% fica em R$%.2f, com acrecimo de R$%.2f",vlrCusto,vlrPercentualAd,vlrFinal,vlrAcrescimo);
        
    }
}
