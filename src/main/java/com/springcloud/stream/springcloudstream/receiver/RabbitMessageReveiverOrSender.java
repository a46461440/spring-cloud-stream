package com.springcloud.stream.springcloudstream.receiver;

import com.springcloud.stream.springcloudstream.messaging.Channel1Input;
import com.springcloud.stream.springcloudstream.messaging.Channer2Input;
import com.springcloud.stream.springcloudstream.messaging.InputOut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding({Sink.class, Channel1Input.class, Channer2Input.class, InputOut.class})
@Slf4j
public class RabbitMessageReveiverOrSender {

    @StreamListener(Channel1Input.CHANNEL)
    public void exchange1Receive(Object payload) {
        byte[] bs = (byte[]) payload;
        this.log.info(new String(bs));
    }

    @StreamListener(Channer2Input.CHANNEL)
    public void exchange2Receive(Object payload) {
        byte[] bs = (byte[]) payload;
        this.log.info(new String(bs));
    }

//    @StreamListener(Sink.INPUT)
//    @SendTo(InputOut.CHANNEL)
//    public String inputOut(){
//        return "hello";
//    }

}
