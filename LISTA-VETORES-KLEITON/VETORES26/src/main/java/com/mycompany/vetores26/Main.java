/*
Faça um programa em Java que leia e armazene **100 números inteiros** em um vetor.
Em seguida, solicite ao usuário um número a ser pesquisado no vetor.
O programa deverá informar a posição da **primeira ocorrência** do número procurado. 
Caso ele não seja encontrado, deverá exibir uma mensagem informando que o número não existe no vetor.
*/

package com.mycompany.vetores26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];

        System.out.println("Digite 100 números inteiros:");
        for (int i = 0; i < 100; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite o número a ser buscado: ");
        int numeroProcurado = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == numeroProcurado) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}
