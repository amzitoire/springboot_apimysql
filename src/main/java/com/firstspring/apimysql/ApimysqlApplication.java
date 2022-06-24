package com.firstspring.apimysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.firstspring.apimysql.controller","com.firstspring.apimysql.service","com.firstspring.apimysql.repository"})
@EnableJpaRepositories(basePackages = "com.firstspring.apimysql.repository")
@EntityScan(basePackages = "com.firstspring.apimysql.model")
public class ApimysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApimysqlApplication.class, args);
	}

}
