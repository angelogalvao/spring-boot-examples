package io.github.angelogalvao.example.spring.api;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageConsumer {

    @JmsListener(destination = "${test.queue}")
    public void receiveMessage(String message) {
        log.info(message);
    }
}
