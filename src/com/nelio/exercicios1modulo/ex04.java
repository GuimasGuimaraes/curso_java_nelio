package com.nelio.exercicios1modulo;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do funcionario");
        double numeroFuncionario = scanner.nextDouble();

        System.out.println("Digite quantas horas trabalhadas por dia");
        double horasTrabalhadas = scanner.nextDouble();
        double mensal = horasTrabalhadas * 24;

        System.out.println("Digite o valor pago pela hora trabalhada");
        int valorHora = scanner.nextInt();
        double salario = valorHora * mensal;

        System.out.printf("O salário do funcionario é de %.2f%n ", salario);
    }
}
