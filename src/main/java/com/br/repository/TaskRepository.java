package com.br.repository;

import java.util.List;
import com.br.domain.Task;

public interface TaskRepository {

    void adicionarTarefa(Task task);

    List<Task> listarTodasTarefas();

    Task listarTarefaPorID(int id);

    void marcarTarefaComoConcluida(int id);

}
