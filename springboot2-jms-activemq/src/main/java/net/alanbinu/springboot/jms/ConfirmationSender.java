package net.alanbinu.springboot.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class ConfirmationSender {

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final Confirmation confirmation) {
        jmsTemplate.convertAndSend("confirmationQueue", confirmation);
    }
}
