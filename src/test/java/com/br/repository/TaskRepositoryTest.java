package com.br.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.br.domain.Task;
import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;

public class TaskRepositoryTest {

    TaskRepository repository = new TaskRepositoryImpl();
    Task task = new Task("oi", Prioridade.ALTA, "Java", Status.PENDENTE);


    @Test
    void deveSalvarComSucesso() {

        repository.adicionarTarefa(task);

        assertEquals(1, repository.listarTodasTarefas().size());

    }
}
