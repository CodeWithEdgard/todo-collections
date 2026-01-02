package com.br.service;

import java.util.List;
import com.br.domain.Task;
import com.br.exception.TaskNullResponse;
import com.br.repository.TaskRepository;

public class TaskServiceImpl implements TaskService {

    private TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {

        this.repository = repository;
    }

    @Override
    public void adicionarTarefa(Task task) {

        if (task.equals(null)) {
            throw new TaskNullResponse("Valor de entrada não pode ser nullo");
        }

        repository.adicionarTarefa(task);
    }

    @Override
    public List<Task> listarTodasTarefas() {

        return repository.listarTodasTarefas();
    }

    @Override
    public void listarTarefasPendentes() {}

    @Override
    public void listarTarefasConcluidas() {}

    @Override
    public void marcarTarefaComoConcluida(long id) {}

    @Override
    public void filtrarTarefasPorPrioridade() {}

    @Override
    public void filtrarTarefasPorCategoria() {}

    @Override
    public void mostrarEstatisticas() {}


}
