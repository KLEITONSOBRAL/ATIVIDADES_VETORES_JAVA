/*
Crie um programa em Java que declare um vetor com 50 posições,
armazene nele todos os números pares existentes no intervalo de 1 a 100 e, ao final,
exiba os valores armazenados no vetor.
*/

package com.mycompany.vetores3;

public class Main {

    public static void main(String[] args) {

        int[] pares = new int[50];

        int index = 0;
        for (int i = 2; i <= 100; i += 2) {
            pares[index] = i;
            index++;
        }

        System.out.println("Números pares no intervalo de 1 a 100:");

        for (int i = 0; i < pares.length; i++) {
            
            System.out.println(pares[i]);
        }
    }
}

