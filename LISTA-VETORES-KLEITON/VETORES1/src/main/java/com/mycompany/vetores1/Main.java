/*
Crie um programa em Java que declare um vetor de números inteiros com 51 posições.
Preencha o vetor com os números de 0 a 50 e, em seguida, exiba todos os valores armazenados.
*/

package com.mycompany.vetores1;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[51];

        for (int i = 0; i <= 50; i++) {
            numeros[i] = i;
        }

        System.out.println("Números armazenados no vetor:");
        
        for (int i = 0; i <= 50; i++) {
            System.out.println(numeros[i]);
        }
    }
}

