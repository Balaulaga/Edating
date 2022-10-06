package com.bala.edate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages= {"com.bala.edate.repo"})
public class EDatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EDatingApplication.class, args);
	}

}
