/*
Faça um programa em Java que leia e armazene o nome de **3 estados** e suas respectivas **capitais** em uma matriz.
Após a leitura, o programa deverá exibir cada estado acompanhado de sua capital.
*/

package com.mycompany.vetores23;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[][] estados = new String[3][2];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do estado " + (i + 1) + ": ");
            estados[i][0] = scanner.nextLine();
            System.out.print("Digite a capital do estado " + (i + 1) + ": ");
            estados[i][1] = scanner.nextLine();
        }

        System.out.println("\nEstados e suas capitais:");
        for (int i = 0; i < 3; i++) {
            System.out.println(estados[i][0] + " - " + estados[i][1]);
        }

        scanner.close();
    }
}
