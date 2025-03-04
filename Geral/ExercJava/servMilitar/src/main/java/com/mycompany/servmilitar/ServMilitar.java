/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.servmilitar;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ServMilitar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome,sexo,saude;
        int idade;
        char continuar = 's';
        int s = 0;
        int n = 0;

        while (continuar == 's' || continuar == 'S') {            
            System.out.print("Digite nome: ");
            nome = scan.next();
            System.out.print("Digite sexo(M = Masculino F= Feminino): ");
            sexo = scan.next();
            System.out.print("Digite idade: ");
            idade = scan.nextInt();            
            System.out.print("Digite estado de saúde: ");
            saude = scan.next();
            
            if (idade <= 17 || idade >= 19){
                System.out.println("Pela sua idade atual, não esta apto para alistamento.");
                n++;
            } else{
                System.out.println("Pela sua idade atual, esta apto para alistamento.");
                s++;
            }
        System.out.print("Deseja continuar (S/N): ");
        continuar = scan.next().charAt(0);
        }    
        System.out.printf("Existem ao total %d, sendo %d aptas e %d não aptas ao alistamento.",(s+n),s,n);  
    }
}
