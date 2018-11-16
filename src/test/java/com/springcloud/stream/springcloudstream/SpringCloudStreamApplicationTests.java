package com.springcloud.stream.springcloudstream;

import com.springcloud.stream.springcloudstream.messaging.InputOut;
import com.springcloud.stream.springcloudstream.receiver.RabbitMessageReveiverOrSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudStreamApplicationTests {

    private RabbitMessageReveiverOrSender rabbitMessageReveiverOrSender;

    private InputOut inputOut;

    private RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {
        this.inputOut.output().send(MessageBuilder.withPayload("from inputOut").build());
    }

    @Test
    public void testRabbit() {
        this.rabbitTemplate.convertAndSend("topic1", "", "ojbk");
    }

    @Autowired
    public void setRabbitMessageReveiverOrSender(RabbitMessageReveiverOrSender rabbitMessageReveiverOrSender) {
        this.rabbitMessageReveiverOrSender = rabbitMessageReveiverOrSender;
    }

    @Autowired
    public void setInputOut(InputOut inputOut) {
        this.inputOut = inputOut;
    }

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }
}
