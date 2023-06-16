package com.luan.projectwebfullstackback;

import com.luan.projectwebfullstackback.tarefa.Tarefa;
import com.luan.projectwebfullstackback.tarefa.repositoies.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@SpringBootApplication
public class ProjectWebFullstackBackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectWebFullstackBackApplication.class, args);
	}


	private final TarefaRepository tarefaRepository;

	public ProjectWebFullstackBackApplication(TarefaRepository tarefaRepository) {
		this.tarefaRepository = tarefaRepository;
	}


	@Override
	public void run(String... args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		Tarefa t1 = new Tarefa(1,"Estudar","Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("20/06/2023 10:00", formatter), false);

		this.tarefaRepository.saveAll(List.of(t1));
	}
}
