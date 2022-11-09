package br.com.rocha.dan.consumers.kafka.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConsumerConfig {

  @Bean
  public Queue testeQueue() {
    return new Queue("teste", true);
  }

  @Bean
  public DirectExchange exchange() {
    return new DirectExchange("direct-exchange");
  }

  @Bean
  public Binding testeBinding() {
    return BindingBuilder.bind(testeQueue()).to(exchange()).with("teste-routing-key");
  }


}
