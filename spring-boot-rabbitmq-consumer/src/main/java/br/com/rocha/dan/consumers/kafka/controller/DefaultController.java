package br.com.rocha.dan.consumers.kafka.controller;

import br.com.rocha.dan.consumers.kafka.model.Event;
import br.com.rocha.dan.consumers.kafka.model.UserExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class DefaultController {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private ObjectMapper objectMapper;

	@GetMapping
	void publish() throws JsonProcessingException {

		var event = Event.builder()
				.version("V1")
				.name("CREATE_USER")
				.payload(objectMapper.writeValueAsString(UserExample.builder()
						.name("joaozinho")
						.birthDate("03/01/1970")
						.document("00000000191")
						.build()))
				.build();

		rabbitTemplate.convertAndSend("teste", event);

	}

}
