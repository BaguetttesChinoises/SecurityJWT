package com.generalitesecurite.jwt;

import com.generalitesecurite.jwt.dao.TaskRepository;
import com.generalitesecurite.jwt.entites.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;

	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("t1","t2","t3").forEach(t->{
			taskRepository.save(new Task(null,t));
		});
		List<Task> taskList = taskRepository.findAll();
		taskList.forEach(task->{
			System.out.println(task.getTaskName());
		});

	}
}
