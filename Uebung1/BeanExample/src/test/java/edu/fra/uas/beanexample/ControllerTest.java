package edu.fra.uas.beanexample;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private BeanController beanController;

    @Autowired
    private MessageService messageService;

    @Test
    void testController() {
        messageService.increment();
        messageService.increment();
        assertThat(messageService.getCounter()).isEqualTo(2);
        assertThat(beanController.putMessage("Das ist ein Test")).isEqualTo("put message: Das ist ein Test");
    }
    
}
