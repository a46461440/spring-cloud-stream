package com.springcloud.stream.springcloudstream.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Queues {

    @Bean
    @Qualifier("topic.a")
    public Queue topicQueueA() {
        return new Queue("topic.a");
    }

    @Bean
    @Qualifier("topic.ab")
    public Queue topicQueueB() {
        return new Queue("topic.ab");
    }

    @Bean
    @Qualifier("famousA")
    public Queue famousQueueA(){
        return new Queue("famousA");
    }

}
