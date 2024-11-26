package edu.fra.uas.ManyObjectPerBean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirdService {

    @Autowired
    CounterService counterService;

    public int zeigeZaehler() {
        return counterService.incrementCounter();
    }
}