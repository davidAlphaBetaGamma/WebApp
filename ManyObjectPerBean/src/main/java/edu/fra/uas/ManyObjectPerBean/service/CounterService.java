package edu.fra.uas.ManyObjectPerBean.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int counter = 0;

    public int incrementCounter() {
        counter++;
        return counter;
    }

}
