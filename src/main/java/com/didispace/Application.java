package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author chen
 * @version 1.0.0
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class) ;
//		Person person= ctx.getBean(BusinessPerson.class) ;
//		person.service() ;
		SpringApplication.run(Application.class, args);

	}

}
