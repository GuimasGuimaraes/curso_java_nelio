package com.nelio.estruturacondicional;

import java.util.Scanner;

public class ExAula01 {

    // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é positivo");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Número positivo ");
        } else {
            System.out.println("Número negativo");
        }
    }


}
