package net.kiekertest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(final String[] args) {
		System.out.println("Starting spring boot");
		final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-config.xml");

		applicationContext.start();

		final SpringApplication build = new SpringApplicationBuilder(applicationContext, DemoApplication.class).build();
		build.run(args);

		// SpringApplication.run(DemoApplication.class, args);
	}

}
