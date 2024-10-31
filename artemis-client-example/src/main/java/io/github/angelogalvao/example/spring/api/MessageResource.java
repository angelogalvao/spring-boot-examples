package io.github.angelogalvao.example.spring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MessageResource {
    
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${test.queue}")
    private String destination;

    @Value("${greeting}")
    private String message;

    @RequestMapping("/sendTestMessage")
    public void sendTestMessage() {

      log.info("Sending the message {} to the destination {}", message, destination);
		  jmsTemplate.convertAndSend(destination, message);

    }
}
