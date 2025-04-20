package psu.edu.ch06.crud02;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import psu.edu.ch06.crud02.controller.ProductController;




@SpringBootApplication
public class crud02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(crud02Application.class, args);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	

	}

}
