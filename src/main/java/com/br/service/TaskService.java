package com.br.service;

import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;

public interface TaskService {

    void adicionarTarefa(String titulo, Prioridade prioridade, String categoria, Status status);

    void listarTodasTarefas();

    void listarTarefasPendentes();

    void listarTarefasConcluidas();

    void marcarTarefaComoConcluida(long id);

    void filtrarTarefasPorPrioridade();

    void filtrarTarefasPorCategoria();

    void mostrarEstatisticas();
}
