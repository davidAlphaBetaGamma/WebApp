package edu.fra.uas.service;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.BeanExampleApplication;
import edu.fra.uas.controller.BeanController;

@Component
public class MessageService {


    private static final Logger log = LoggerFactory.getLogger(MessageService.class);
    private String message;
    int counter = 0;

    public void increment() {
        this.counter = counter + 1;
    }

    public int getCounter() {
        return counter;
    }

    public String getMessage() {
        log.debug("protcolling: ", message);
        return message;
    }

    public void setMessage(String message) {
        log.debug("protcolling: ", message);
        this.message = message;
    }
}
