package com.br.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.br.domain.Task;
import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;
import com.br.repository.TaskRepository;
import com.br.repository.TaskRepositoryImpl;


public class TaskServiceImplTest {

    TaskRepository repository;
    Task task;
    TaskService service;

    @BeforeEach
    void setUp() {

        repository = new TaskRepositoryImpl();
        task = new Task("oi", Prioridade.ALTA, "Java", Status.PENDENTE);
        service = new TaskServiceImpl(repository);

    }

    @Test
    public void deveAdicionarComSucesso() {

        service.adicionarTarefa(task);

        assertEquals(1, repository.listarTodasTarefas().size());
    }

}
