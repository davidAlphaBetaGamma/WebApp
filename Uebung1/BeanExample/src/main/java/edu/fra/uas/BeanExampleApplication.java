package edu.fra.uas;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootApplication
public class BeanExampleApplication {

	private static final Logger log = LoggerFactory.getLogger(BeanExampleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BeanExampleApplication.class, args);
	}

	@Autowired
	private BeanController beanController;

	@Autowired
	private MessageService messageService;

	@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				log.debug(beanController.putMessage("Hallo Welt"));
				log.debug(beanController.putMessage("HAAALLOOOO"));
				messageService.setMessage("Hello World");
				System.out.println(messageService.getMessage());
				messageService.setMessage("HAAALLOOOO!!!");
				System.out.println(messageService.getMessage());
			}
		};
		return action;
	}

	

}
