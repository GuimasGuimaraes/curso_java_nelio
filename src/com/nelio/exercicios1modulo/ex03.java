package com.nelio.exercicios1modulo;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 4 números inteiros");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println("Calculando e mostrando a diferença do produto A e B pelo C e D");
        int diferenca = (a * b - c * d);

        System.out.println("A diferença dos valores é : " + diferenca);


    }
}
