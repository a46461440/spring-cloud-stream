package com.springcloud.stream.springcloudstream.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Channer2Input {
    String CHANNEL = "channel2";

    @Input("channel2")
    SubscribableChannel input();
}
