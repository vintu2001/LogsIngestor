package com.vineet.LogsIngestor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import static com.vineet.LogsIngestor.constants.PackageConstants.*;
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {CONSTANTS,CONTROLLER,DTO,EXCEPTION,MAPPER,POJO,REPO,SERVICE,CONFIG,UTIL})
public class LogsIngestorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogsIngestorApplication.class, args);
	}

}
