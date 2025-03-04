/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mediaaluno;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class MediaAluno {

    public static void main(String[] args) {
    String aluno;
    float n1,n2,n3;
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    aluno = scan.nextLine();
    System.out.printf("Digite a 1º nota do %s: ",aluno);
    n1 = scan.nextInt();
    System.out.printf("Digite a 2º nota do %s: ",aluno);
    n2 = scan.nextInt();
    System.out.printf("Digite a 3º nota do %s: ",aluno);
    n3 = scan.nextInt();

    System.out.printf("A media do aluno %s e %.1f",aluno,((n1+n2+n3)/3));
        
        
    }
}
