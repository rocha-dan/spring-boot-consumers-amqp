package br.com.rocha.dan.consumers.kafka.listener;

import br.com.rocha.dan.consumers.kafka.model.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@KafkaListener(topics = "${kafka-topic-name}" , groupId = "${kafka-group-id-name}")
public class ListenerKafka {

  @KafkaHandler
  void listener(Event event,  @Header(KafkaHeaders.GROUP_ID) String groupId)  {
    System.out.println(groupId+ "Listener received data: " + event);

  }

}
