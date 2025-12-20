package br.com.escola.salaaula;

import java.util.ArrayList;
import java.util.List;

public class SalaDeAula {

    private List<Aluno> alunos;

    public SalaDeAula() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome) {
        alunos.add(new Aluno(nome));
    }

    public void removerAluno(String nome) {
        List<Aluno> alunosParaRemover = new ArrayList<>();

        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                alunosParaRemover.add(a);
            }
        }

        alunos.removeAll(alunosParaRemover);
    }

    public void listarAlunos() {
        System.out.println(alunos);
    }

    public static void main(String[] args) {

        SalaDeAula sala = new SalaDeAula();

        sala.adicionarAluno("Ana");
        sala.adicionarAluno("João");
        sala.adicionarAluno("Carlos");

        sala.listarAlunos();

        sala.removerAluno("João");

        sala.listarAlunos();
    }
}



/*
[Ana, João, Carlos]
[Ana, Carlos]*/
