package com.br.repository;

import java.util.Set;
import com.br.domain.Task;

public interface TaskRepository {

    void adicionarTarefa(Task task);

    Set<Task> listarTodasTarefas();

}
