package com.springcloud.stream.springcloudstream.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"famousA", "topic.a", "topic.ab"})
@Slf4j
public class RabbitMQListener {

    @RabbitHandler
    public void receiver(String string) {
        this.log.info(string);
    }

}
