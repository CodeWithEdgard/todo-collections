package com.br.application;


import com.br.domain.Task;
import com.br.domain.enums.Prioridade;
import com.br.domain.enums.Status;
import com.br.repository.TaskRepository;
import com.br.repository.TaskRepositoryImpl;
import com.br.service.TaskService;
import com.br.service.TaskServiceImpl;

public class Application {

        public static void main(String[] args) {


                Task tarefa = new Task("Collections em Java", Prioridade.ALTA, "Java",
                                Status.EM_ANDAMENTO); // modelo

                Task tarefa1 = new Task("Orientação a objetos", Prioridade.MEDIA, "Java",
                                Status.CONCLUIDO); // modelo

                TaskRepository repository = new TaskRepositoryImpl(); // dados

                TaskService service = new TaskServiceImpl(repository);

                service.adicionarTarefa(tarefa);
                service.adicionarTarefa(tarefa1);

                System.out.println(service.listarTodasTarefas());

        }
}
