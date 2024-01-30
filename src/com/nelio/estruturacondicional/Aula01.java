package com.nelio.estruturacondicional;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas horas?");
        int horas = scanner.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia");
        } else if (horas < 18) {
            System.out.println("Boa tarde");
        } else if (horas <= 23) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Digite um valor válido");
        }

        scanner.close();

    }
}
