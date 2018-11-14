package com.springcloud.stream.springcloudstream.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface InputOut {

    String CHANNEL = "output";

    @Output("output")
    SubscribableChannel output();

}
