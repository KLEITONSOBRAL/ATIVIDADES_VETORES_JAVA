/*
Considere o vetor `V = {5, 1, 4, 2, 7, 8, 3, 6}`. 
Desenvolva um programa em Java que realize operações de troca e atribuição entre 
os elementos do vetor e, ao final, exiba o conteúdo de todas as suas posições.
*/

package com.mycompany.vetores6;

public class Main {

    public static void main(String[] args) {

        int[] v = {5, 1, 4, 2, 7, 8, 3, 6};

        for (int i = 7; i >= 4; i--) {
            int aux = v[i];
            v[i] = v[7 - i];
            v[7 - i] = aux;
        }

        v[2] = v[0];

        v[v[2] - 1] = v[v[1] - 1];

        System.out.println("Conteúdo final do vetor:");

        for (int i = 0; i < v.length; i++) {
            
            System.out.println("v[" + i + "] = " + v[i]);
        }
    }
}
