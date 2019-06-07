package com.rest.parakeet.myparakeet;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyparakeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyparakeetApplication.class, args);
	}

}
