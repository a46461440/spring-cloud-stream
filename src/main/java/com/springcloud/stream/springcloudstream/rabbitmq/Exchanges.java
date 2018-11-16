package com.springcloud.stream.springcloudstream.rabbitmq;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Exchanges {

    @Bean
    @Qualifier("topicExchangeOne")
    public TopicExchange exchange1() {
        return new TopicExchange("topic1");
    }

    @Bean
    @Qualifier("topicExchangeMore")
    public TopicExchange exchange2() {
        return new TopicExchange("topic2");
    }

}
