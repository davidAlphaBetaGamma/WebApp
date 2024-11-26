package edu.fra.uas.ManyObjectPerBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.ManyObjectPerBean.service.FirstService;
import edu.fra.uas.ManyObjectPerBean.service.SecondService;
import edu.fra.uas.ManyObjectPerBean.service.ThirdService;

@SpringBootApplication
public class SingletonBeanApplication {

	@Autowired
	FirstService firstService;
	@Autowired
	SecondService secondService;
	@Autowired
	ThirdService thirdService;

	public static void main(String[] args) {
		SpringApplication.run(SingletonBeanApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		CommandLineRunner action = new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				System.out.println("Zählerstand: "+firstService.zeigeZaehler());
				System.out.println("Zählerstand: "+firstService.zeigeZaehler());
				System.out.println("Zählerstand: "+secondService.zeigeZaehler());
				System.out.println("Zählerstand: "+thirdService.zeigeZaehler());
			}
		};
		return action;
	}
}
