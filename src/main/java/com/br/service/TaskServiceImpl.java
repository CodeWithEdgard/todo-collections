package com.br.service;

import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;

public class TaskServiceImpl implements TaskService {

    @Override
    public void adicionarTarefa(String titulo, Prioridade prioridade, String categoria,
            Status status) {}

    @Override
    public void listarTodasTarefas() {}

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
