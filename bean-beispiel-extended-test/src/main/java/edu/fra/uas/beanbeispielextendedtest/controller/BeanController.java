package edu.fra.uas.beanbeispielextendedtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.beanbeispielextendedtest.service.MessageService;

@Component
public class BeanController {

    @Autowired
    private MessageService messageService;

    public String putMessage(String message) {
        messageService.setMessage(" put message: " + message);
        return messageService.getMessage();
    }
}
