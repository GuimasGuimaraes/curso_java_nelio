package com.nelio.estruturacondicional;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        Scanner scanner = new Scanner(System.in);

        double horaInicial, horaFinal, duracao;


        System.out.println("Digite a hora inicial ");
        horaInicial = scanner.nextDouble();
        System.out.println("Digite a hora final");
        horaFinal = scanner.nextDouble();

        duracao = horaFinal - horaInicial ;

        if (duracao < 1) {
            System.out.println("Tempo insuficiente");
        } else if (duracao >= 1) {
            System.out.println("Hrs: " + duracao);
        } else {
            System.out.println("Tempo limite de 24hrs exedido");
        }


    }
}
