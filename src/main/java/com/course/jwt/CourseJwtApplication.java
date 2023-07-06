package com.course.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@EnableAutoConfiguration
@EnableConfigurationProperties
@SpringBootApplication
public class CourseJwtApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseJwtApplication.class, args);

		System.out.println("- - - - Curso spring boot Security corriendo - - - -");
	}

}
