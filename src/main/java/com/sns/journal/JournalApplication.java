package com.sns.journal;

import com.sns.journal.domain.Journal;
import com.sns.journal.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JournalApplication.class, args);
	}


	@Bean
	InitializingBean saveData(JournalRepository repository) {
		return () -> {
			repository.save(new Journal("Get to know Spring Boot",
					"Spring Boot 2.1.6 demo", "01/04/2019"));
			repository.save(new Journal("Get to know Swagger",
					"Swagger2 with Spring Boot", "06/04/2019"));
			repository.save(new Journal("Get to know Logging in Spring Boot",
					"Spring Boot Logging demo", "08/04/2019"));
		};
	}
}
