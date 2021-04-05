package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.WashingMachine;

public class WashingMachineTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring-init.xml");
		WashingMachine washingMachine = container.getBean(WashingMachine.class);

		washingMachine.wash();
		washingMachine.displayDetails();
		System.out.println("beans created" + " " + container.getBeanDefinitionCount());

	}

}
