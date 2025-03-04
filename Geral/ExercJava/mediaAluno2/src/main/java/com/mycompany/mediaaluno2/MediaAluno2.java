/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mediaaluno2;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class MediaAluno2 {

    public static void main(String[] args) {
    String aluno;
    float n1,n2,n3,media;
    String status;
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o nome do aluno: ");
    aluno = scan.nextLine();
    System.out.printf("Digite a 1º nota do %s: ",aluno);
    n1 = scan.nextInt();
    System.out.printf("Digite a 2º nota do %s: ",aluno);
    n2 = scan.nextInt();
    System.out.printf("Digite a 3º nota do %s: ",aluno);
    n3 = scan.nextInt();
    
    media = (n1+n2+n3)/3;
    
        if (media >= 7) {
            status = "aprovado";
        } else if (media <= 5) {
            status = "reprovado";
        } else {
            status = "em recuperação";
        }
    
    
    System.out.printf("A media do aluno %s e %.1f estando %s",aluno,media,status);
    
    }
}
