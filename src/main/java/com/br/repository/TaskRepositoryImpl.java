package com.br.repository;

import java.util.LinkedHashSet;
import java.util.Set;
import com.br.domain.Task;

public class TaskRepositoryImpl implements TaskRepository {

    private Set<Task> listaHistoricoTarefas = new LinkedHashSet<>();

    @Override
    public void adicionarTarefa(Task task) {

        listaHistoricoTarefas.add(task);
    }

    @Override
    public Set<Task> listarTodasTarefas() {

        return listaHistoricoTarefas;
    }

}
