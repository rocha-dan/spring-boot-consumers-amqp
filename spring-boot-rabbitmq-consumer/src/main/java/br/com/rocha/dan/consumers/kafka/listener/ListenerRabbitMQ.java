package br.com.rocha.dan.consumers.kafka.listener;

import br.com.rocha.dan.consumers.kafka.model.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ListenerRabbitMQ {

  @RabbitListener(queues = "teste")
  void listener(@Payload Event event)  {
    System.out.println("Listener received data: " + event);

  }

}
