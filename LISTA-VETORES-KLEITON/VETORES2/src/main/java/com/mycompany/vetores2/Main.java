/*
Crie um programa em Java que declare um vetor de números inteiros com 100 posições.
Preencha o vetor com os números de 100 até 1, em ordem decrescente, e depois exiba todos os valores armazenados.
*/

package com.mycompany.vetores2;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = 100 - i;
        }

        System.out.println("Números armazenados no vetor (de 100 a 1):");

        for (int i = 0; i < 100; i++) {
            
            System.out.println(numeros[i]);
        }
    }
}

