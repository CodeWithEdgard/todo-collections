package com.br.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;

public class TaskTest {

    private Task tarefa;

    @BeforeEach
    void setUp() {
        tarefa = new Task("Aprendendo Collections", Prioridade.ALTA, "Estudos em Java ",
                Status.EM_ANDAMENTO);
    }


    @Test
    void criarUmaTarefaComSucesso() {

        assertEquals("Aprendendo Collections", tarefa.getTitulo());

    }

}
