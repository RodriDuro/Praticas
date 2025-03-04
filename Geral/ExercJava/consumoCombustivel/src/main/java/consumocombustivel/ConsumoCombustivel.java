/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package consumocombustivel;

import java.util.Scanner;

/**
 *distancia total / combustivel gasto = consumo medio
 * 
 */
public class ConsumoCombustivel {

    public static void main(String[] args) {
        float distTotal;
        float combGasto;
        
        
        Scanner calc = new Scanner(System.in);
        
        System.out.print("Digite a distancia total percorrida: ");
        distTotal = calc.nextFloat();
        System.out.print("Digite o combustivel gasto no trajeto: ");
        combGasto = calc.nextFloat();
        
        System.out.println("Foi gasto no total "+(distTotal/combGasto)
                +" litros de combustivel por kilometro");
        
    }
}
