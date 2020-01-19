package com.auth0.example;

import com.auth0.example.repositories.CommentRepository;
import com.auth0.example.repositories.PostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@PropertySources({
		@PropertySource("classpath:application.yaml"),
		@PropertySource("classpath:auth0.properties")
})
@EnableJpaRepositories(basePackageClasses = {
		PostRepository.class,
		CommentRepository.class,
})
public class App {

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
