package br.com.rocha.dan.consumers.activemq.producer;

import br.com.rocha.dan.consumers.activemq.model.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class JmsProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${queue-name}")
    private String queueName;

    public void sendMessage(Event event){
        try{
            log.info("Attempting Send message to Queue: "+ queueName);
            jmsTemplate.convertAndSend(queueName, event);
        } catch(Exception e){
           log.error("Recieved Exception during send Message: ", e);
        }
    }
}