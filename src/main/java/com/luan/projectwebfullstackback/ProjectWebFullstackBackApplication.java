package com.luan.projectwebfullstackback;
import com.luan.projectwebfullstackback.tarefa.Tarefa;
import com.luan.projectwebfullstackback.tarefa.repositoies.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


@SpringBootApplication
public class ProjectWebFullstackBackApplication implements CommandLineRunner {

	@Autowired
	private TarefaRepository tarefaRepository;


	public static void main(String[] args) {
		SpringApplication.run(ProjectWebFullstackBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

		Tarefa t1 = new Tarefa(null,"Estudar","Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("20/06/2023 10:00", formatter), false);

		tarefaRepository.saveAll(Arrays.asList(t1));
	}
}
