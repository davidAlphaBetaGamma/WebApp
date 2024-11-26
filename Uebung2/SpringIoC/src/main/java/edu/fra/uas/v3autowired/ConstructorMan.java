package edu.fra.uas.v3autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorMan {

    @Autowired
    @Qualifier("Building house")
    Work work;

    public void performWork() {
        work.doWork();
    }

}