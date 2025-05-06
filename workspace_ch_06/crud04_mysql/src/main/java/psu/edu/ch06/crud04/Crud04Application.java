package psu.edu.ch06.crud04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;





@SpringBootApplication(scanBasePackages = {"psu.edu.ch06.crud04"})
public class Crud04Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Crud04Application.class, args);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	

	}

}
