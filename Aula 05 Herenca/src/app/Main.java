package app;

import entity.Aluno;
import entity.Endereco;
import entity.Professor;

public class Main {
    public static void main(String[] args) {

        Endereco endProf = new Endereco("Rua tal", 234, 123456);

        Endereco endAluno = new Endereco("Rua falana", 342, 16435);

        Professor prof1 = new Professor("Victor", "342424243", 20,endProf, "hoje");

        Aluno aluno1 = new Aluno("Fulano", "3242432", 20, endAluno, "23143243");

        System.out.println(aluno1);

        prof1.falar("Boa noite turma");

        aluno1.falar("Ola prof");

        prof1.darAula("Herença 3° pilar da POO");

        aluno1.fazerPergunta("O que é mesmo herença ?");

        prof1.responderPergunta("É o 3° pilar da POO");
    }
}