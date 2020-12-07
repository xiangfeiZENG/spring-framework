package com.ferenc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author <a href="mailto:ferenc.zeng@gmail.com">Ferenc Zeng</a>
 * @since 2020-11-17
 */
@Configuration
public class Entrance {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for(String name : beanDefinitionNames) {
			System.out.println(name);
		}



	}
}
