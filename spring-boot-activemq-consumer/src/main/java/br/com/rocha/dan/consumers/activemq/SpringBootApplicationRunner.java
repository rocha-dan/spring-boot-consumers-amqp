package br.com.rocha.dan.consumers.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationRunner.class, args);
	}

}
