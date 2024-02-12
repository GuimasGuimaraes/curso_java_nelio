package com.nelio.estruturacondicional;

public class Arrays02 {
    public static void main(String[] args) {

        String[] alunos = new String[3];
        alunos[0]= "Guilherme";
        alunos[1] = "Gustavo";
        alunos[2]= "Gabriel";


        for (String turma : alunos) {
            System.out.println(turma);
        }

    }
}
