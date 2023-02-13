package com.oscavian.springbootemup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication //(scanBasePackages = "com")
//@EnableJpaRepositories("com.oscavian.springbootemup")
public class SpringbootemupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootemupApplication.class, args);
	}

}

//https://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration
