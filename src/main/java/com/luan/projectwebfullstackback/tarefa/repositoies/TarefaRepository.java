package com.luan.projectwebfullstackback.tarefa.repositoies;

import com.luan.projectwebfullstackback.tarefa.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
}
