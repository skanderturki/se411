package psu.edu.ch06.tuto01;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import psu.edu.ch06.tuto01.controller.ProductController;




@SpringBootApplication
public class Tuto01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Tuto01Application.class, args);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	

	}

}
