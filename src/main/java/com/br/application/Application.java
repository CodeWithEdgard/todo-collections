package com.br.application;

import com.br.domain.Task;
import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;

public class Application {

    public static void main(String[] args) {

        Task tarefa = new Task("Bem Vindo ao todo list ", Prioridade.ALTA, "Diversos",
                Status.EM_ANDAMENTO);

        System.out.println(tarefa);

    }
}
