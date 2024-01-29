package com.nelio.exercicios1modulo;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.

        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuario o valor do raio
        System.out.println("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        // Calcular a área do circulo usando a formula: area = π * raio^2
        double area = Math.PI * Math.pow(raio, 2);

        //Exibindo resultado com quatro casas decimais
        System.out.printf("A área do círculo é: %.4f%n", area);
        scanner.close();

    }
}
