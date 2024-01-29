package com.nelio.exercicios1modulo;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        System.out.println("Programa de calculos númericos");
        Scanner scanner = new Scanner(System.in);

        int valor1;
        int valor2;
        int resultado;

        System.out.println("Digite o primeiro valor");
        valor1 = scanner.nextInt();

        System.out.println("Agora digite o segundo valor");
        valor2 = scanner.nextInt();

        resultado = valor1 + valor2;
        System.out.println("A soma dos números inseridos é: " + resultado);


    }
}
