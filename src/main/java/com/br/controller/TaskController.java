package com.br.controller;

import java.util.Set;
import com.br.domain.Task;

public interface TaskController {

    void adicionarTarefa(Task task);

    Set<Task> listarTodasTarefas();
}
