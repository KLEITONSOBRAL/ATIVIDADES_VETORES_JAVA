/*
Faça um programa em Java que leia um número inteiro correspondente a um mês do ano, considerando valores de **1 a 12**.
Em seguida, o programa deverá exibir o nome do mês correspondente ao número informado.
Caso o valor digitado esteja fora do intervalo de 1 a 12, deverá ser exibida uma mensagem informando que o número do mês é inválido.
*/

package com.mycompany.vetores25;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
                "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("O mês é: " + meses[mes]);
        } else {
            System.out.println("Número de mês inválido.");
        }

        scanner.close();
    }
}
