package com.springcloud.stream.springcloudstream.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface InputOut {

    String CHANNEL = "output";

    @Output("output")
    MessageChannel output();

}
