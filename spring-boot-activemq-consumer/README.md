# projeto-springboot

- SpringBoot 2.7.5
- ActiveMQ 2.6.13
- Lombok


![alt text](https://miro.medium.com/max/640/1*2trvYYIw8dQTCKI24nlGZw.jpeg)


Para testar:

Para rodar este projeto é necessário a instalação e configuração do RabbitMQ + erlang.
Rode o docker-compose.yaml dentro da pasta docker, se você já utiliza o Docker.

Para testar o Produtor:
> curl --location --request GET 'http://localhost:8080/test'

Resposta:
> Listener received data: Event(version=V1, name=CREATE_USER, payload={"name":"joaozinho","document":"00000000191","birthDate":"03/01/1970"})
