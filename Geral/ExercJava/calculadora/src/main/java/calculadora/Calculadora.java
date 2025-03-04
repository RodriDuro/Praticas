/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculadora;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Calculadora {

    public static void main(String[] args) {
        int n1;
        int n2;
        int result = 0;
        byte escolha;
        
        Scanner calc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        n1 = calc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = calc.nextInt();
        System.out.printf("""
                          Escolha o tipo de operação: 
                          1 - Soma 
                          2 - Subtração 
                          3 - Multiplicação
                          4 - Divisão
                          """);
        escolha = calc.nextByte();
        
        switch (escolha) {
            case 1 -> {
                result = n1 + n2;
                System.out.printf("O Resultado da soma de %d + %d = %d ",n1,n2,result);
            }
            case 2 -> {
                result = n1 - n2;
                System.out.printf("O Resultado da subtração de %d - %d = %d ",n1,n2,result);
            }
            case 3 -> {
                result = n1 * n2;
                System.out.printf("O Resultado da multiplicação de %d * %d = %d ",n1,n2,result);
            }
            case 4 -> {
                float n3 = n1;
                float n4 = n2;
                float div = result;
                div = n3 / n4;
                System.out.printf("O Resultado da divisão de %d / %d = %.2f ",n1,n2,div);
            }
            
        }
    }
}
