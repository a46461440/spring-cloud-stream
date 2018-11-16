package com.springcloud.stream.springcloudstream.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Binder {

    public Queue topicQueue1;

    public Queue topicQueue2;

    public Queue famousA;

    public Exchange exchangeTopicOne;

    public Exchange exchangeTopicMore;

    @Autowired
    public void setTopicQueue1(@Qualifier("topic.a") Queue topicQueue1) {
        this.topicQueue1 = topicQueue1;
    }

    @Autowired
    public void setTopicQueue2(@Qualifier("topic.ab") Queue topicQueue2) {
        this.topicQueue2 = topicQueue2;
    }

    @Autowired
    public void setFamousA(@Qualifier("famousA") Queue famousA) {
        this.famousA = famousA;
    }

    @Autowired
    public void setExchangeTopicOne(@Qualifier("topicExchangeOne") Exchange exchangeTopicOne) {
        this.exchangeTopicOne = exchangeTopicOne;
    }

    @Autowired
    public void setExchangeTopicMore(@Qualifier("topicExchangeMore") Exchange exchangeTopicMore) {
        this.exchangeTopicMore = exchangeTopicMore;
    }

//    @Bean
//    public Binding binding1() {
//        return BindingBuilder.bind(this.topicQueue1).to(this.exchangeTopicOne);
//    }
//
//    @Bean
//    public Binding binding2() {
//        return BindingBuilder.bind(this.famousA).to(this.exchangeTopicMore);
//    }

}
