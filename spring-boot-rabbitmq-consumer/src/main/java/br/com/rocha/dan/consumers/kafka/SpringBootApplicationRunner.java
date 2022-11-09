package br.com.rocha.dan.consumers.kafka;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringBootApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationRunner.class, args);
	}

}
