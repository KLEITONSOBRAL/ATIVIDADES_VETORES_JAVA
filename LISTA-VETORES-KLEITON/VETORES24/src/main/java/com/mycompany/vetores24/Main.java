/*
Faça um programa em Java que leia o valor cobrado por **quilowatt (kW)** e a quantidade de consumidores que serão cadastrados.
Para cada consumidor, o programa deverá solicitar:
* O nome do consumidor;
* A quantidade de quilowatts consumidos.
Em seguida, deverá calcular e exibir o valor total da conta de energia de cada consumidor, utilizando a fórmula:
**Total a pagar = valor do kW × quantidade de kW consumidos**
*/

package com.mycompany.vetores24;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do Kw: ");
        double valorKw = scanner.nextDouble();
        scanner.nextLine();  // Limpa o buffer

        System.out.print("Digite o número de consumidores: ");
        int numConsumidores = scanner.nextInt();
        scanner.nextLine();  // Limpa o buffer

        for (int i = 0; i < numConsumidores; i++) {
            System.out.print("\nDigite o nome do consumidor: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a quantidade de Kw consumidos: ");
            double kwConsumidos = scanner.nextDouble();
            scanner.nextLine();  // Limpa o buffer

            double totalAPagar = valorKw * kwConsumidos;
            System.out.println("\nConsumidor: " + nome);
            System.out.println("Total a pagar: R$ " + totalAPagar);
        }

        scanner.close();
    }
}

