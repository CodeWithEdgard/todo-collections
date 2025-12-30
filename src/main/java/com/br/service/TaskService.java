package com.br.service;

import java.util.List;
import com.br.domain.Task;

public interface TaskService {

    void adicionarTarefa(Task task);

    List<Task> listarTodasTarefas();

    void listarTarefasPendentes();

    void listarTarefasConcluidas();

    void marcarTarefaComoConcluida(long id);

    void filtrarTarefasPorPrioridade();

    void filtrarTarefasPorCategoria();

    void mostrarEstatisticas();
}
