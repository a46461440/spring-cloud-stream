package com.springcloud.stream.springcloudstream.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Channel1Input {
    String CHANNEL = "channel1";

    @Input("channel1")
    SubscribableChannel input();
}
