package com.br.service;

import java.util.Set;
import com.br.domain.Task;

public interface TaskService {

    void adicionarTarefa(Task task);

    Set<Task> listarTodasTarefas();

    void listarTarefasPendentes();

    void listarTarefasConcluidas();

    void marcarTarefaComoConcluida(long id);

    void filtrarTarefasPorPrioridade();

    void filtrarTarefasPorCategoria();

    void mostrarEstatisticas();
}
