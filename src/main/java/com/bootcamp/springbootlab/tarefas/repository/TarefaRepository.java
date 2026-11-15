package com.bootcamp.springbootlab.tarefas.repository;

import com.bootcamp.springbootlab.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
