package br.com.rocha.dan.consumers.activemq.listener;

import br.com.rocha.dan.consumers.activemq.model.Event;

import lombok.extern.slf4j.Slf4j;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

@Component
@Slf4j
public class ListenerRabbitMQ implements MessageListener {

  @Override
  @JmsListener(destination = "${queue-name}")
  public void onMessage(Message message) {
    try{
      ObjectMessage objectMessage = (ObjectMessage)message;
      Event event = (Event)objectMessage.getObject();

      log.info("Received Message: "+ event.toString());
    } catch(Exception e) {
      log.error("Received Exception : "+ e);
    }

  }

}
