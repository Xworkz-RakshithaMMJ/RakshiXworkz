package com.xworkz.watch.util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.xworkz.watch.exception.SessionFactoryCreationException;

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		System.out.println("initialising session factory static block");
		Configuration configuration = new Configuration();
		configuration.configure();
		factory = configuration.buildSessionFactory();
		if (factory != null) {
			System.out.println("SF Util is created successfully");
		} else {
			throw new SessionFactoryCreationException("SF util is not created");
		}
	}

}
