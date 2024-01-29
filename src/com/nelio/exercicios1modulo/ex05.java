package com.nelio.exercicios1modulo;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

        Scanner scanner = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = scanner.nextInt();
        qte1 = scanner.nextInt();
        preco1 = scanner.nextDouble();

        cod2 = scanner.nextInt();
        qte2 = scanner.nextInt();
        preco2 = scanner.nextDouble();
        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("Valor a pagar: R$%.2f%n",total );
        scanner.close();
    }
}
