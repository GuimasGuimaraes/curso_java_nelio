package com.nelio.estruturacondicional;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é par ou impar");
        int num = scanner.nextInt();

        if (num %2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }
    }
}
