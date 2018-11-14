package com.springcloud.stream.springcloudstream;

import com.springcloud.stream.springcloudstream.receiver.RabbitMessageReveiverOrSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudStreamApplicationTests {

	private RabbitMessageReveiverOrSender rabbitMessageReveiverOrSender;

	@Test
	public void contextLoads() {
		this.rabbitMessageReveiverOrSender.inputOut();
	}

	@Autowired
	public void setRabbitMessageReveiverOrSender(RabbitMessageReveiverOrSender rabbitMessageReveiverOrSender) {
		this.rabbitMessageReveiverOrSender = rabbitMessageReveiverOrSender;
	}
}
